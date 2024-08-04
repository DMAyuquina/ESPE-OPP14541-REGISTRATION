package ec.edu.espe.registersystemmaven.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.UpdateResult;
import ec.edu.espe.registersystemmaven.model.Tutor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import org.bson.Document;
import org.bson.conversions.Bson;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.Updates;

/**
 * @author LogicLegion, DCCO-ESPE
 */
public class TutorFuncionalities {

    public static Tutor getTutor(MongoCollection<Document> mongoCollection, String student) {
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
        return new Tutor(id, names, lastNames, phone, email, careerCode, career);
    }

    public static void updateStudentGrades(String id, MongoDatabase database, JComboBox<String> cmbCareer) {
        if (utils.ValidationOfData.validationDni(id.length(), id)) {
            boolean found = false;
            MongoCollection<Document> collectionToUpdate = null;
            Document existingStudent = null;

            for (String collectionName : database.listCollectionNames()) {
                MongoCollection<Document> collection = database.getCollection(collectionName);
                Document filter = new Document("id", id);

                existingStudent = collection.find(filter).first();
                if (existingStudent != null) {
                    found = true;
                    collectionToUpdate = collection;
                    break;
                }
            }

            if (found && collectionToUpdate != null) {
                String newGradeUnitOne = JOptionPane.showInputDialog("Ingrese la Nota del Primer Parcial:", existingStudent.getString("gradeUnitOne"));
                if (newGradeUnitOne == null) newGradeUnitOne = existingStudent.getString("gradeUnitOne");

                String newGradeUnitTwo = JOptionPane.showInputDialog("Ingrese la Nota del Segundo Parcial:", existingStudent.getString("gradeUnitTwo"));
                if (newGradeUnitTwo == null) newGradeUnitTwo = existingStudent.getString("gradeUnitTwo");

                float gradeUnitOne = Float.parseFloat(newGradeUnitOne);
                float gradeUnitTwo = Float.parseFloat(newGradeUnitTwo);
                float average = (gradeUnitOne + gradeUnitTwo) / 2;

                String newLastChance;
                if (average < 7) {
                    newLastChance = JOptionPane.showInputDialog("Ingrese la Nota del Supletorio", existingStudent.getString("lastChance"));
                    if (newLastChance == null) newLastChance = existingStudent.getString("lastChance");
                } else {
                    newLastChance = null;
                }

                Bson updateFilter = eq("id", id);
                Bson update = Updates.combine(
                        Updates.set("gradeUnitOne", newGradeUnitOne),
                        Updates.set("gradeUnitTwo", newGradeUnitTwo),
                        Updates.set("lastChance", newLastChance)
                );

                UpdateResult result = collectionToUpdate.updateOne(updateFilter, update);

                if (result.getMatchedCount() > 0) {
                    JOptionPane.showMessageDialog(null, "Notas del Estudiante actualizado exitosamente!");
                    loadStudentsTable(cmbCareer.getSelectedItem().toString());
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar las notas del estudiante. Verifique los datos.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el estudiante con la cédula proporcionada.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cédula inválida.");
        }
    }

    
    private static void loadStudentsTable(String career) {
        
    }
}
