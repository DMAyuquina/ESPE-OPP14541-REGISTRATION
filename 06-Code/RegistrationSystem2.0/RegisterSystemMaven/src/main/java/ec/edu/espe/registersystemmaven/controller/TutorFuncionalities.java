package ec.edu.espe.registersystemmaven.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import ec.edu.espe.registersystemmaven.model.Tutor;
import org.bson.Document;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class TutorFuncionalities {

    public static Tutor getTutor(MongoCollection<Document> mongoCollection, String student) {
        //TODO-Modificar para nuevos atributos, tomando como referencia a la estructura del método getStudent de StudentFucnionalities
        Tutor tutor = new Tutor();
        Document findDocument = new Document("id", student);

        String id = "";
        String names = "";
        String lastNames = "";
        String phone = "";
        String email = "";
        String careerCode = "";
        String career = "";

        for (Document doc : mongoCollection.find(findDocument)) {
            id = doc.getString("id");
            names = doc.getString("names");
            lastNames = doc.getString("last names");
            phone = doc.getString("phone");
            email = doc.getString("email");
            careerCode = doc.getString("career code");
            career = doc.getString("career");
        }
        return tutor ;
    }

}
