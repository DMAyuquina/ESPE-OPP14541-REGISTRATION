package ec.edu.espe.registersystemmaven.controller;

import Utils.MongoManagerMaven;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.registersystemmaven.model.Career;
import ec.edu.espe.registersystemmaven.model.Grade;
import ec.edu.espe.registersystemmaven.model.Registration;
import ec.edu.espe.registersystemmaven.model.Student;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import org.bson.Document;

/**
 *
 * @author LogicLegion, DCCO-ESPE
 */
public class StudentFuncionality {

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

                Double unitOne = gradeDoc.getDouble("unitOne");
                grade.setUnitOne(unitOne.floatValue());

                Double unitTwo = gradeDoc.getDouble("unitTwo");
                grade.setUnitTwo(unitTwo.floatValue());

                Double finalGrade = gradeDoc.getDouble("finalGrade");
                grade.setFinalGrade(finalGrade.floatValue());

                Double lastChance = gradeDoc.getDouble("lastChance");
                grade.setLastChance(lastChance.floatValue());
            }
            student.setGrade(grade);

            Date bornOnDate = doc.getDate("bornOnDate"); 
            if (bornOnDate != null) {
                LocalDate localBornOnDate = bornOnDate.toInstant()
                        .atZone(ZoneId.systemDefault())
                        .toLocalDate();
                student.setBornOnDate(localBornOnDate); 
            }
            
            student.setAge(doc.getInteger("age"));

            careerDoc = (Document) doc.get("career");
            if (careerDoc != null) {
                career.setCareerCode(careerDoc.getString("careerCode"));
                career.setCareerName(careerDoc.getString("careerName"));
            }
            student.setCareer(career);

            Double assistence = doc.getDouble("assistence");
            student.setAsistence(assistence.floatValue());

        }
        return student;
    }

    public static void setStudentToMongo(MongoDatabase dataBase, Student student) {
        MongoCollection<Document> mongoCollectionStudents = MongoManagerMaven.accessToCollections(dataBase, "Students");

        Document studentDoc = new Document();
        studentDoc.append("id", student.getDni())
                .append("names", student.getNames())
                .append("lastNames", student.getLastNames())
                .append("genre", student.getGenre())
                .append("email", student.getEmail())
                .append("phone", student.getPhone())
                .append("registration", RegistrationManager.registrationToMongoDocument(student.getRegistration()))
                .append("grade", GradeManager.gradeToMongoDocument(student.getGrade()))
                .append("bornOnDate", (student.getBornOnDate()))
                .append("age", student.getAge())
                .append("career", CareerFuncionality.careerToDocument(student.getCareer()))
                .append("assistence", student.getAsistence());

        mongoCollectionStudents.insertOne(studentDoc);

        MongoCollection<Document> mongoCollectionStudentsPerCareer = MongoManagerMaven.accessToCollections(dataBase, student.getCareer().getCareerName());
        mongoCollectionStudentsPerCareer.insertOne(studentDoc);
    }

}
