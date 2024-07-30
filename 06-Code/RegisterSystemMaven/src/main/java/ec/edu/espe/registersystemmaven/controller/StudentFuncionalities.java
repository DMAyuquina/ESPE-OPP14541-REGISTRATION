
package ec.edu.espe.registersystemmaven.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import ec.edu.espe.registersystemmaven.model.Student;
import org.bson.Document;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class StudentFuncionalities {
        public static Student getStudent(MongoCollection<Document> mongoCollection, String key,String studentId) {

        Document findDocument = new Document(key, studentId);

        String id = "";
        String names = "";
        String lastNanmes = "";
        String genre = "";
        String phone = "";
        String email = "";
        String career = "";
        String careerCode = "";
        String typeOfRegistration = "";
        String u1 = "";
        String u2 = "";
        String lastChance = "";

        for (Document doc : mongoCollection.find(findDocument)) {
            id = doc.getString("id");
            names = doc.getString("names");
            lastNanmes = doc.getString("lastNames");
            careerCode = doc.getString("careerCode");
            email = doc.getString("email");
            phone = doc.getString("phone");
            typeOfRegistration = doc.getString("typeOfRegistration");
            u1 = doc.getString("gradeUnitOne");
            u2 = doc.getString("gradeUnitTwo");
            lastChance = doc.getString("lastChance");
            genre = doc.getString("genre");
            career = doc.getString("career");
        }
        return new Student(id, names, lastNanmes, genre, email, careerCode, phone, career, typeOfRegistration, u1, u2, lastChance);
    }

}
