package ec.edu.espe.registersystemmaven.controller;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.registersystemmaven.model.Career;
import ec.edu.espe.registersystemmaven.model.Course;
import ec.edu.espe.registersystemmaven.model.Tutor;
import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author LogicLegion, DCCO-ESPE
 */
public class TutorFuncionalities {

    public static Tutor getTutor(MongoCollection<Document> mongoCollection, String student) {
        //TODO-Modificar para nuevos atributos, tomando como referencia a la estructura del método getStudent de StudentFucnionalities
        Tutor tutor = new Tutor();
        Document findDocument = new Document("id", student);
       
        ArrayList<Course> courses;
        Career career = new Career();
        
        Document careerDoc = new Document();

        for (Document doc : mongoCollection.find(findDocument)) {
            tutor.setId(doc.getString("id"));
            tutor.setNames(doc.getString("names"));
            tutor.setLastNames(doc.getString("last names"));
            tutor.setUser(doc.getString("user"));
            tutor.setPassword(doc.getString("password"));
            tutor.setPhone(doc.getString("phone"));
            tutor.setEmail(doc.getString("email"));
            tutor.setCourses((ArrayList<Course>)doc.get("courses"));
            
            careerDoc = (Document)doc.get("career");
            if(careerDoc!=null){
                career.setCareerCode(careerDoc.getString("careerCode"));
                career.setCareerName(careerDoc.getString("careerName"));
            }
            tutor.setCareer(career);
            
        }
        return tutor;
    }

}
