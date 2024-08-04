package Utils;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;

/**
 *
 * @author LogicLegion, DCCO-ESPE
 */
public class ValidationOfAccounts {

    public static boolean searchAccountForLogin(MongoCollection<Document> mongoCollection, String key, String variable) {
        
        Document findDocument = new Document(key, variable);

        MongoCursor<Document> resultDocument = mongoCollection.find(findDocument).iterator();
        System.out.println(resultDocument);

        if (resultDocument.hasNext()) {
            return true;
        }
        return false;
    }

   
    public static boolean searchForDuplicateId(MongoCollection<Document> mongoCollection, String key, String variable) {
        Document findDocument = new Document(key, variable);

        MongoCursor<Document> resultDocument = mongoCollection.find(findDocument).iterator();
        System.out.println(resultDocument);

        if (resultDocument.hasNext()) {
            return true;
        }
        return false;
    }
    
    
    public static Document searchAccountByUser(MongoCollection<Document> collection, String key, String user) {
        return collection.find(new Document(key, user)).first();
    }
}
