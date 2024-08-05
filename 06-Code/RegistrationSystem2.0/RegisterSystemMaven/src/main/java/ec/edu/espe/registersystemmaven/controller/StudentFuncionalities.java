package ec.edu.espe.registersystemmaven.controller;

import Utils.MongoManagerMaven;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.registersystemmaven.model.Career;
import ec.edu.espe.registersystemmaven.model.Grade;
import ec.edu.espe.registersystemmaven.model.Registration;
import ec.edu.espe.registersystemmaven.model.Student;
import java.time.LocalDate;
import org.bson.Document;

/**
 *
 * @author LogicLegion, DCCO-ESPE
 */
public class StudentFuncionalities {

    public static Student getStudentFromMongo(MongoCollection<Document> mongoCollection, String key, String studentId) {

        Student student = new Student();

        Document findDocument = new Document(key, studentId);

        Registration registration = new Registration();
        Grade grade = new Grade();
        Career career = new Career();

        Document registrationDoc;
        Document gradeDoc;
        Document careerDoc;

        for (Document doc : mongoCollection.find(findDocument)) {
            student.setDni(doc.getString("id"));
            student.setNames(doc.getString("names"));
            student.setLastNames(doc.getString("lastNames"));
            student.setGenre(doc.getString("genre"));
            student.setEmail(doc.getString("email"));
            student.setPhone(doc.getString("phone"));

            registrationDoc = (Document) doc.get("registration");
            if (registrationDoc != null) {
                registration.setPeriod(registrationDoc.getString("period"));
                registration.setTypeOfRegistration(registrationDoc.getString("typeOfRegistration"));
                registration.setGratuity(registrationDoc.getString("gratuity"));
            }
            student.setRegistration(registration);

            gradeDoc = (Document) doc.get("grade");
            if (gradeDoc != null) {
                grade.setUnitOne((float) gradeDoc.get("unitOne"));
                grade.setUnitTwo((float) gradeDoc.get("unitTwo"));
                grade.setFinalGrade((float) gradeDoc.get("finalGrade"));
                grade.setLastChance((float) gradeDoc.get("lastChance"));
            }
            student.setGrade(grade);

            student.setBornOnDate((LocalDate) doc.get("bornOnDate"));
            student.setAge(doc.getInteger("age"));

            careerDoc = (Document) doc.get("career");
            if (careerDoc != null) {
                career.setCareerCode(careerDoc.getString("careerCode"));
                career.setCareerName(careerDoc.getString("careerName"));
            }
            student.setCareer(career);

            student.setAsistence((float) doc.get("assistence"));

        }
        return student;
    }

    public static void setStudentToMongo(MongoDatabase dataBase, Student student) {
        // Aquí puedes agregar el código para guardar estos datos en la base de datos o en la nube
        MongoCollection<Document> mongoCollectionStudents = MongoManagerMaven.accessToCollections(dataBase, "Students");
        
        Document studentDoc = new Document();
        studentDoc.append("id", student.getDni())
                .append("names", student.getNames())
                .append("lastNames", student.getLastNames())
                .append("genre", student.getGenre())
                .append("email", student.getEmail())
                .append("phone", student.getPhone())
                .append("registration", RegistrationManager.registrationToDocument(student.getRegistration()))
                .append("grade", GradeManager.gradeToDocument(student.getGrade()))
                .append("bornOnDate", (student.getBornOnDate()))
                .append("age", student.getAge())
                .append("career", CareerFuncionalities.careerToDocument(student.getCareer()))
                .append("assistence", student.getAsistence());

        mongoCollectionStudents.insertOne(studentDoc);

        MongoCollection<Document> mongoCollectionStudentsPerCareer = MongoManagerMaven.accessToCollections(dataBase, student.getCareer().getCareerName());
        mongoCollectionStudentsPerCareer.insertOne(studentDoc);
    }

}
