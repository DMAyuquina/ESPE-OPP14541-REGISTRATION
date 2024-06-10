package ec.edu.espe.registrationsystem.model;

import java.util.Scanner;

/**
 *
 * @author Logic Legion, DCCO-ESPE
 */
public class StudentReport {

    public void calculateFinalGrade(double unit1Grade, double unit2Grade, double supplementaryGrade) {

        double finalGrade = (unit1Grade + unit2Grade + supplementaryGrade) / 3;

        System.out.println("The student's final grade is: " + finalGrade);
    }

    public void determinateTypeOfRegistration(String registrationType) {

        switch (registrationType.toLowerCase()) {
            case "first":
                System.out.println("The student is registered for the first time.");
                break;
            case "second":
                System.out.println("The student is registered for the second time.");
                break;
            case "third":
                System.out.println("The student is registered for the third time.");
                break;
            default:
                System.out.println("Unknown type of registration.");
                break;
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
