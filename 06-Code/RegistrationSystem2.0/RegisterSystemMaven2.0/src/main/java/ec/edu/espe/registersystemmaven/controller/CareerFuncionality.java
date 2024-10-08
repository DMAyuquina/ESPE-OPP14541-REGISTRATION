package ec.edu.espe.registersystemmaven.controller;

import ec.edu.espe.registersystemmaven.model.Career;

/**
 *
 * @author LogicLegion, DCCO-ESPE
 */
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class CareerFuncionality  implements GettersAndSettersForMongo{

    public static Document careerToDocument(Career career) {
        Document careerDoc = new Document();
        careerDoc.append("careerName", career.getCareerName())
                .append("careerCode", career.getCareerCode());

        return careerDoc;
    }

  

    @Override
    public Object get(MongoCollection<Document> mongoCollection, String key, String data) {
        Document findDocument = new Document(key, data);

        Document doc = mongoCollection.find(findDocument).first();
        String careerName = "";
        String careerCode = "";

        if (doc != null) {
            careerName = doc.getString("career");
            careerCode = doc.getString("careerCode");
        }

        Career career = new Career(careerName, careerCode);
        return career;}

}
