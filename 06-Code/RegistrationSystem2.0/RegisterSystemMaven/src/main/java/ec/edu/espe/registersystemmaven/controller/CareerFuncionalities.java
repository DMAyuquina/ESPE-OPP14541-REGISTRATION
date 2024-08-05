package ec.edu.espe.registersystemmaven.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import ec.edu.espe.registersystemmaven.model.Career;
import ec.edu.espe.registersystemmaven.model.Tutor;
import org.bson.Document;

/**
 *
 * @author LogicLegion, DCCO-ESPE
 */
import com.mongodb.client.MongoCollection;
import ec.edu.espe.registersystemmaven.model.Grade;
import org.bson.Document;

public class CareerFuncionalities {

        public static Document careerToDocument(Career career){
       Document careerDoc = new Document();
       careerDoc.append("unitOne", career.getCareerName())
               .append("unitTwo", career.getCareerCode());
       
       return careerDoc;
    }
    
    public static Career getCareer(MongoCollection<Document> mongoCollection, String key, String data) {
        Document findDocument = new Document(key, data);

        Document doc = mongoCollection.find(findDocument).first();
        String careerName = "";
        String careerCode = "";

        if (doc != null) {
            careerName = doc.getString("career");
            careerCode = doc.getString("careerCode");
        }
        
        Career car = new Career(careerName, careerCode);
        return car;
    }
    
}
