package Utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.registersystemmaven.model.Student;
import ec.edu.espe.registersystemmaven.model.Tutor;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author LogicLegion, DCCO-ESPE
 */
public class MongoManagerMaven {

    public static MongoDatabase openConnectionToMongo() {
        String uri = "mongodb+srv://logiclegion:logiclegion123@cluster0.pkfbgix.mongodb.net/";
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase dataBase = mongoClient.getDatabase("StudentsDB");

        return dataBase;
    }

    public static void closeConnectionToMongo() {
        String uri = "mongodb+srv://logiclegion:logiclegion123@cluster0.pkfbgix.mongodb.net/";
        MongoClient mongoClient = MongoClients.create(uri);
        mongoClient.close();

    }

    //Acceso a colecciones
    public static MongoCollection<Document> accessToCollections(MongoDatabase dataBase, String collection) {
        MongoCollection<Document> mongoCollection = dataBase.getCollection(collection);
        return mongoCollection;
    }

    //Tipo de ingreso de datos
    public static void insertOneData(Document data, MongoCollection<Document> mongoCollection) {
        mongoCollection.insertOne(data);
    }

    public static void insertMoreThanOneData(List<Document> listOfData, MongoCollection<Document> mongoCollection) {
        mongoCollection.insertMany(listOfData);
    }

    //Obtención de datos
    public static MongoCursor<Document> getAllCollection(MongoCollection<Document> mongoCollection, String key, String data) {

        //Si quiero todo el documento:
        Document findDocument = new Document(key,data);

        MongoCursor<Document> resultDocument = mongoCollection.find(findDocument).iterator();

        return resultDocument;
    }


    //Actualización de documentos
    public static void editDocuments(String key, String data, String newData, MongoCollection<Document> mongoCollection) {
        Document findDocument = new Document(key, data);

        Document updateDocument = new Document("$set", new Document(key, newData));

        mongoCollection.findOneAndUpdate(findDocument, updateDocument);
    }

    //Eliminar documentos
    public static void deleteDocuments(String key, String data, MongoCollection<Document> mongoCollection) {
        //TODO: Combinar con método de obtención de datos
        Document findDocument = new Document("male", true);
        mongoCollection.findOneAndDelete(findDocument);
    }
}
