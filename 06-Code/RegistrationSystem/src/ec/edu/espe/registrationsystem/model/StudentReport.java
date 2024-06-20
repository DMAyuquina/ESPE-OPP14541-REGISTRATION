package ec.edu.espe.registrationsystem.model;

import java.util.Scanner;

/**
 *
 * @author Logic Legion, DCCO-ESPE
 */
public class StudentReport {

    public void calculateFinalGrade(double unit1Grade, double unit2Grade, double supplementaryGrade) {

        double finalGrade = (unit1Grade + unit2Grade + supplementaryGrade) / 3;

        System.out.println("La calificación final del estudiante es: " + finalGrade);
        
    }

    public void determinateTypeOfRegistration(String registrationType) {

        switch (registrationType.toLowerCase()) {
            case "first" ->
                System.out.println("El estudiante está registrado por primera vez.");
            case "second" ->
                System.out.println("El estudiante está registrado por segunda vez.");
            case "third" ->
                System.out.println("El estudiante está registrado por tercera vez.");
            default ->
                System.out.println("Tipo de registro desconocido.");
        }
    }

    public void generateStudentReport(double unit1Grade, double unit2Grade, double supplementaryGrade, String registrationType) {

        calculateFinalGrade(unit1Grade, unit2Grade, supplementaryGrade);

        determinateTypeOfRegistration(registrationType);

    }

    public String calculateGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese notas del alumno:");
        String stringFinalGrade;
        System.out.print("Unidad 1: ");
        float unitOne = scanner.nextFloat();

        System.out.print("Unidad 2: ");
        float unitTwo = scanner.nextFloat();

        float finalGrade = (unitOne + unitTwo) / 2;

        stringFinalGrade = String.valueOf(finalGrade);

        return stringFinalGrade;

    }
}
