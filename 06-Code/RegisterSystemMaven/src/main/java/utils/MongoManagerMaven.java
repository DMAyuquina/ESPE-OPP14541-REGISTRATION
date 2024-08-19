package Utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author LogicLegion, DCCO-ESPE
 */
public class MongoManagerMaven {

    public static MongoDatabase openConnectionToMongo() {
        if (mongoClient == null) {
            String uri = "mongodb+srv://logiclegion:logiclegion123@cluster0.pkfbgix.mongodb.net/";
            mongoClient = MongoClients.create(uri);
        }
        return mongoClient.getDatabase("StudentsDB");
    }

    public static void closeConnectionToMongo() {
        if (mongoClient != null) {
            mongoClient.close();
            mongoClient = null;  // Limpiar la referencia para evitar errores en futuras conexiones
        }
    }

    //Acceso a colecciones
    public static MongoCollection<Document> accessToCollections(MongoDatabase dataBase, String collection) {
        return dataBase.getCollection(collection);
    }

    //Tipo de ingreso de datos
    public static void insertOneData(Document data, MongoCollection<Document> mongoCollection) {
        mongoCollection.insertOne(data);
    }

    public static void insertMoreThanOneData(List<Document> listOfData, MongoCollection<Document> mongoCollection) {
        mongoCollection.insertMany(listOfData);
    }

    public static List<Document> getAllCollection(MongoCollection<Document> mongoCollection) {
        return mongoCollection.find().into(new ArrayList<>());
    }
    
    private static MongoClient mongoClient;
    // Método para acceder a una colección específica
    public static MongoCollection<Document> accessToCollections(String databaseName, String collectionName) {
        MongoDatabase database = accessToDatabase(databaseName);
        return database.getCollection(collectionName);
    }

    public static MongoDatabase accessToDatabase(String databaseName) {
        if (mongoClient == null) {
            String connectionString = "mongodb+srv://logiclegion:logiclegion123@cluster0.pkfbgix.mongodb.net/";
            mongoClient = MongoClients.create(connectionString);
        }
        return mongoClient.getDatabase(databaseName);
    }

    public static void editDocuments(String key, String data, String newData, MongoCollection<Document> mongoCollection) {
        Document findDocument = new Document(key, data);
        Document updateDocument = new Document("$set", new Document(key, newData));
        mongoCollection.findOneAndUpdate(findDocument, updateDocument);
    }

    public static void deleteDocuments(String key, String data, MongoCollection<Document> mongoCollection) {
        Document findDocument = new Document(key, data);
        mongoCollection.findOneAndDelete(findDocument);
    }
}
