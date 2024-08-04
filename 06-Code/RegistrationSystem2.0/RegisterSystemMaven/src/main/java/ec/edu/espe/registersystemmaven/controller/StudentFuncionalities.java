package ec.edu.espe.registersystemmaven.controller;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.registersystemmaven.model.Career;
import ec.edu.espe.registersystemmaven.model.Grade;
import ec.edu.espe.registersystemmaven.model.Registration;
import ec.edu.espe.registersystemmaven.model.Student;
import java.util.Date;
import org.bson.Document;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class StudentFuncionalities {

    public static Student getStudent(MongoCollection<Document> mongoCollection, String key, String studentId) {
        
        Student student = new Student();
        
        Document findDocument = new Document(key, studentId);

        Registration registration=new Registration();
        Grade grade = new Grade();
        Career career = new Career();
        
        Document registrationDoc = new Document();
        Document gradeDoc = new Document();
        Document careerDoc = new Document();

        for (Document doc : mongoCollection.find(findDocument)) {
            student.setDni(doc.getString("id"));
            student.setNames(doc.getString("names"));
            student.setLastNames(doc.getString("lastNames"));
            student.setGenre(doc.getString("genre"));
            student.setEmail(doc.getString("email"));
            student.setPhone(doc.getString("phone"));
            
            registrationDoc = (Document)doc.get("registration");
            if(registrationDoc!=null){
                registration.setPeriod(registrationDoc.getString("period"));
                registration.setTypeOfRegistration(registrationDoc.getString("typeOfRegistration"));
                registration.setGratuity(registrationDoc.getString("gratuity"));
            }
            student.setRegistration(registration);
            
            gradeDoc = (Document)doc.get("grade");
            if(gradeDoc!=null){
                grade.setUnitOne((float)gradeDoc.get("unitOne"));
                grade.setUnitTwo((float)gradeDoc.get("unitTwo"));
                grade.setFinalGrade((float)gradeDoc.get("finalGrade"));
                grade.setLastChance((float)gradeDoc.get("lastChance"));
            }
            student.setGrade(grade);
            
            student.setBornOnDate((Date)doc.get("bornOnDate"));
            
            careerDoc = (Document)doc.get("career");
            if(careerDoc!=null){
                career.setCareerCode(careerDoc.getString("careerCode"));
                career.setCareerName(careerDoc.getString("careerName"));
            }
            student.setCareer(career);
            
            student.setAssistence((float)doc.get("assistence"));
            
        }
        return student;
    }
}
