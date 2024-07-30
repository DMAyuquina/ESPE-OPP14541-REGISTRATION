/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class ValidationOfAccounts {

    public static boolean searchAccountForLogin(MongoCollection<Document> mongoCollection, String key, String variable) {
        //Puede servir para validar cuentas duplicadas
        Document findDocument = new Document(key, variable);

        MongoCursor<Document> resultDocument = mongoCollection.find(findDocument).iterator();
        System.out.println(resultDocument);

        if (resultDocument.hasNext()) {
            return true;
        }
        return false;
    }
    //TODO method for duplicate accounts and id
    public static boolean searchForDuplicateId(MongoCollection<Document> mongoCollection, String key, String variable) {
        
        Document findDocument = new Document(key, variable);

        MongoCursor<Document> resultDocument = mongoCollection.find(findDocument).iterator();
        System.out.println(resultDocument);

        if (resultDocument.hasNext()) {
            return true;
        }
        return false;
    }
}
