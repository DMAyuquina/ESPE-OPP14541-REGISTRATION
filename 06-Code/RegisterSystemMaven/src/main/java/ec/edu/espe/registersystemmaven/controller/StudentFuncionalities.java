package ec.edu.espe.registersystemmaven.controller;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.registersystemmaven.model.Student;
import java.util.Scanner;
import org.bson.Document;
import utils.ValidationOfData;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class StudentFuncionalities {

    public static Student getStudent(MongoCollection<Document> mongoCollection, String key, String studentId) {

        Document findDocument = new Document(key, studentId);

        String id = "";
        String names = "";
        String lastNanmes = "";
        String genre = "";
        String phone = "";
        String email = "";
        String career = "";
        String careerCode = "";
        String typeOfRegistration = "";
        String u1 = "";
        String u2 = "";
        String lastChance = "";

        for (Document doc : mongoCollection.find(findDocument)) {
            id = doc.getString("id");
            names = doc.getString("names");
            lastNanmes = doc.getString("lastNames");
            careerCode = doc.getString("careerCode");
            email = doc.getString("email");
            phone = doc.getString("phone");
            typeOfRegistration = doc.getString("typeOfRegistration");
            u1 = doc.getString("gradeUnitOne");
            u2 = doc.getString("gradeUnitTwo");
            lastChance = doc.getString("lastChance");
            genre = doc.getString("genre");
            career = doc.getString("career");
        }
        return new Student(id, names, lastNanmes, genre, email, careerCode, phone, career, typeOfRegistration, u1, u2, lastChance);
    }

    public void calculateFinalGrade(double unit1Grade, double unit2Grade, double supplementaryGrade) {

        double finalGrade = (unit1Grade + unit2Grade + supplementaryGrade) / 3;

        System.out.println("La calificación final del estudiante es: " + finalGrade);

    }

    public String calculateGrade() {

        Scanner scanner = new Scanner(System.in);
        String stringFinalGrade;

        System.out.println("Ingrese notas del alumno:");
        float unitOne = 0.0F;
        do {
            System.out.print("Unidad 1: ");
            unitOne = ValidationOfData.validationOfFloat(unitOne, scanner);
        } while (unitOne == -1.0F);

        float unitTwo = 0.0F;
        do {
            System.out.print("Unidad 2: ");
            unitTwo = ValidationOfData.validationOfFloat(unitTwo, scanner);
        } while (unitTwo == -1.0F);
        float finalGrade = (unitOne + unitTwo) / 2;

        stringFinalGrade = String.valueOf(finalGrade);

        return stringFinalGrade;

    }
}
