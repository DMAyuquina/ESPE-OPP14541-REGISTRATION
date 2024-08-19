package ec.edu.espe.registersystemmaven.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import ec.edu.espe.registersystemmaven.model.Career;
import ec.edu.espe.registersystemmaven.model.Course;
import ec.edu.espe.registersystemmaven.model.Tutor;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author LogicLegion, DCCO-ESPE
 */
public class TutorFuncionalities {

    public static Tutor getTutorFromMongo(MongoCollection<Document> mongoCollection, String student) {
        Tutor tutor = new Tutor();
        Document findDocument = new Document("id", student);

        Career career = new Career();

        Document careerDoc = new Document();

        for (Document doc : mongoCollection.find(findDocument)) {
            tutor.setId(doc.getString("id"));
            tutor.setNames(doc.getString("names"));
            tutor.setLastNames(doc.getString("last names"));
            tutor.setUser(doc.getString("user"));
            tutor.setPassword(doc.getString("password"));
            tutor.setPhone(doc.getString("phone"));
            tutor.setEmail(doc.getString("email"));
            tutor.setCourses((ArrayList<Course>) doc.get("courses"));

            careerDoc = (Document) doc.get("career");
            if (careerDoc != null) {
                career.setCareerCode(careerDoc.getString("careerCode"));
                career.setCareerName(careerDoc.getString("careerName"));
            }
            tutor.setCareer(career);

        }
        return tutor;
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
                if (newGradeUnitOne == null) {
                    newGradeUnitOne = existingStudent.getString("gradeUnitOne");
                }

                String newGradeUnitTwo = JOptionPane.showInputDialog("Ingrese la Nota del Segundo Parcial:", existingStudent.getString("gradeUnitTwo"));
                if (newGradeUnitTwo == null) {
                    newGradeUnitTwo = existingStudent.getString("gradeUnitTwo");
                }

                float gradeUnitOne;
                float gradeUnitTwo;
                try {
                    gradeUnitOne = Float.parseFloat(newGradeUnitOne);
                    gradeUnitTwo = Float.parseFloat(newGradeUnitTwo);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Las notas deben ser números válidos.");
                    return;
                }

                float average = (gradeUnitOne + gradeUnitTwo) / 2;

                String newLastChance = null;
                if (average < 7) {
                    newLastChance = JOptionPane.showInputDialog("Ingrese la Nota del Supletorio", existingStudent.getString("lastChance"));
                    if (newLastChance == null) {
                        newLastChance = existingStudent.getString("lastChance");
                    }
                }

                Bson updateFilter = Filters.eq("id", id);
                Bson update = Updates.combine(
                        Updates.set("gradeUnitOne", newGradeUnitOne),
                        Updates.set("gradeUnitTwo", newGradeUnitTwo),
                        Updates.set("average", average), // Actualización del promedio
                        Updates.set("lastChance", newLastChance)
                );

                UpdateResult result = collectionToUpdate.updateOne(updateFilter, update);

                if (result.getMatchedCount() > 0) {
                    JOptionPane.showMessageDialog(null, "Notas del Estudiante actualizado exitosamente!");
                    loadStudentsTable(cmbCareer.getSelectedItem().toString(), database);
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

    private static void loadStudentsTable(String career, MongoDatabase database) {
        DefaultTableModel mt = new DefaultTableModel();
        String ids[] = {"CEDULA", "NOMBRES", "APELLIDOS", "NOTA UNIDAD 1", "NOTA UNIDA 2", "PROMEDIO", "SUPLETORIO"};
        mt.setColumnIdentifiers(ids);

        MongoCollection<Document> collection = database.getCollection(career);
        var students = collection.find().into(new ArrayList<>());

        for (Document student : students) {
            mt.addRow(new Object[]{
                student.getString("id"),
                student.getString("names"),
                student.getString("lastNames"),
                student.getString("gradeUnitOne"),
                student.getString("gradeUnitTwo"),
                student.getDouble("average"),
                student.getString("lastChance")
            });
        }

    }
}
