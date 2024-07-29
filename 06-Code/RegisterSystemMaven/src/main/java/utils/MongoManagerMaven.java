package Utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.registersystemmaven.model.Student;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author LogicLegion, DCCO-ESPE
 */
public class MongoManagerMaven {

    //Abir conexión con mongoDB
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
    public static MongoCursor<Document> getAllCollection(MongoCollection<Document> mongoCollection) {

        //Si quiero todo el documento:
        Document findDocument = new Document();

        MongoCursor<Document> resultDocument = mongoCollection.find(findDocument).iterator();

        while (resultDocument.hasNext()) {
            System.out.println(resultDocument.next().getString("name"));
        }

        return resultDocument;
    }

    public static Student getStudent(MongoCollection<Document> mongoCollection, String student) {

        //Si quiero todo el documento:
        Document findDocument = new Document("id", student);

        MongoCursor<Document> resultDocument = mongoCollection.find(findDocument).iterator();

        while (resultDocument.hasNext()) {
            System.out.println(resultDocument.next().getString("names"));
            System.out.println(resultDocument);
        }
        String id="";
        String names="";
        String lastNanmes="";
        String genre="";
        String phone="";
        String email="";
        String career="";
        String careerCode="";
        String typeOfRegistration="";
        String u1="";
        String u2="";
        String lastChance="";
        
        for (Document doc : mongoCollection.find()) {
            id = doc.getString("id");
            names = doc.getString("names");
            lastNanmes = doc.getString("last names");
            careerCode = doc.getString("career code");
            email = doc.getString("email");
            phone = doc.getString("phone");
            typeOfRegistration = doc.getString("type of registration");
            u1 = doc.getString("Grade Unit 1");
            u2 = doc.getString("Grade Unit 2");
            lastChance = doc.getString("Last Chance");
            genre = doc.getString("genre");
            career = doc.getString("career");
        }
        return new Student(id, names, lastNanmes, genre, email, careerCode, phone, career, typeOfRegistration, u1, u2, lastChance);
    }

    public static boolean searchAccount(MongoCollection<Document> mongoCollection, String key, String variable) {
        //Si solo busco en base a un solo dato 
        Document findDocument = new Document(key, variable);

        MongoCursor<Document> resultDocument = mongoCollection.find(findDocument).iterator();
        System.out.println(resultDocument);

        if (resultDocument.hasNext()) {
            return true;
        }
        return false;
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
