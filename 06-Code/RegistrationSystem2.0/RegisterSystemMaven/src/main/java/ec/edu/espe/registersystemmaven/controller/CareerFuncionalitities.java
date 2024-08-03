package ec.edu.espe.registersystemmaven.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import ec.edu.espe.registersystemmaven.model.Career;
import ec.edu.espe.registersystemmaven.model.Tutor;
import org.bson.Document;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class CareerFuncionalitities {

    public static Career getCareer(MongoCollection<Document> mongoCollection, String key, String data) {
        Document findDocument = new Document(key, data);

        Document doc = mongoCollection.find(findDocument).first();
        String careerName = "";
        String careerCode = "";

        if (doc != null) {
            careerName = doc.getString("career");
            careerCode = doc.getString("careerCode");
        }


        System.out.println(careerCode);
        System.out.println(careerName);
        
        Career car = new Career(careerName, careerCode);
        return car;
    }
}
