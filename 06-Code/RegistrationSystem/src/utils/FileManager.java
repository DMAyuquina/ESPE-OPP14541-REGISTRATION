package utils;

import ec.edu.espe.registrationsystem.model.Student;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Logic Legion, DCCO-ESPE
 */
public class FileManager {

    public static void FileSave(String data, String fileName) {
        fileName = fileName + ".csv";

        try (FileWriter fileWriter = new FileWriter(fileName, true); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(data);
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.err.println("Error escribiendo al archivo: " + e.getMessage());
        }
    }

    public static void clearFile(String fileName) {
        fileName = fileName + ".csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("");
        } catch (IOException e) {
            System.err.println("Error clearing the file: " + e.getMessage());
        }
    }

    public static int FileReadLastId(String fileName) {
        String lastLine = "";
        fileName = fileName + ".csv";
        String separator = ",";

        try (BufferedReader read = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = read.readLine()) != null) {
                lastLine = line;
            }
            if (lastLine != null) {
                String[] values = lastLine.split(separator);
                try {
                    return Integer.parseInt(values[0]);
                } catch (NumberFormatException e) {
                    System.out.println("Error reading last data");
                    return 0;
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        return 0;
    }

    public static void addStudents(Scanner scanner, String fileName) {
        System.out.println("\n============================================================");
        System.out.print("Cuantos estudiantes quiere agregar?: ");
        int studentNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("============================================================");

        for (int aux = 0; aux < studentNumber; aux++) {
            System.out.println("Informacion del Estudiante Nuevo");
            System.out.println("------------------------------------------------------------");

            System.out.print("Cedula: ");
            String dni = scanner.next();
            System.out.println("------------------------------------------------------------");

            scanner.nextLine();
            System.out.print("Nombres: ");
            String name = scanner.nextLine();
            System.out.println("------------------------------------------------------------");

            System.out.print("Apellidos: ");
            String lastName = scanner.nextLine();
            System.out.println("------------------------------------------------------------");

            System.out.print("Codigo de Carrera: ");
            String careerCode = scanner.next();
            System.out.println("------------------------------------------------------------");

            System.out.print("Email: ");
            String email = scanner.next();
            System.out.println("------------------------------------------------------------");

            System.out.print("Celular: ");
            String phone = scanner.next();
            System.out.println("------------------------------------------------------------");

            System.out.print("Tipo de Matricula: ");
            String typeOfRegistration = scanner.next();
            System.out.println("------------------------------------------------------------");

            System.out.print("Calificacion: ");
            String grade = scanner.next();
            System.out.println("------------------------------------------------------------");

            System.out.print("Supletorio: ");
            String lastChance = scanner.next();
            scanner.nextLine();
            System.out.println("------------------------------------------------------------");

            Student student = new Student(dni, name, lastName, careerCode, email, phone, typeOfRegistration, grade, lastChance);
            FileManager.FileSave(student.toString(), fileName);
        }
        pause(scanner);
    }
    
        private static void pause(Scanner scanner) {
        System.out.print("Pulse Enter para continuar...\n");
        scanner.nextLine();
    }
}
