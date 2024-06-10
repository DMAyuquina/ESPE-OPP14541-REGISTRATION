package utils;

import ec.edu.espe.registrationsystem.model.Student;
import ec.edu.espe.registrationsystem.model.Tutor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
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

    public void addStudents(Scanner scanner, String fileName) {
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

            String gratuity;

            if (typeOfRegistration.equals("Primera")) {
                gratuity = "Con Gratuidad";
            } else {
                gratuity = "Sin Gratuidad";
            }

            System.out.print("Calificacion: ");
            String grade = calculateGrade();
            System.out.println("------------------------------------------------------------");

            System.out.print("Supletorio: ");
            String lastChance = scanner.next();
            scanner.nextLine();
            System.out.println("------------------------------------------------------------");

            Student student = new Student(dni, name, lastName, careerCode, email, phone, typeOfRegistration, grade, lastChance, gratuity);
            FileManager.FileSave(student.toString(), fileName);
        }
        pause(scanner);
    }

    public void readStudents(Scanner scanner, String fileName) {
        List<Student> students = Reader.readStudents(fileName);
        System.out.println("\n===================================================================================");
        System.out.println("Lista de Estudiantes:");
        System.out.println("===================================================================================");
        int i = 1;
        for (Student student : students) {
            if (i != 1) {
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println(student);
            }
            i++;
        }
        System.out.println("-------------------------------------------------------------------------------------");
        pause(scanner);
    }

    public void updateStudent(Scanner scanner, String fileName) {
        System.out.println("\n============================================================");
        System.out.print("Introduzca la Cedula del Estudiante a Editar: ");
        String dni = scanner.next();
        scanner.nextLine();
        System.out.println("============================================================");
        Student existingStudent = Searcher.findStudentByDNI(fileName, dni);

        if (existingStudent != null) {
            System.out.println("Edicion la Informacion del Estudiante:");
            System.out.println("------------------------------------------------------------");

            System.out.print("Nombre [" + existingStudent.getName() + "]: ");
            String name = scanner.nextLine();
            System.out.println("------------------------------------------------------------");

            System.out.print("Apellido [" + existingStudent.getLastName() + "]: ");
            String lastName = scanner.nextLine();
            System.out.println("------------------------------------------------------------");

            System.out.print("Codigo de Carrera [" + existingStudent.getCareerCode() + "]: ");
            String careerCode = scanner.next();
            scanner.nextLine();
            System.out.println("------------------------------------------------------------");

            System.out.print("Email [" + existingStudent.getEmail() + "]: ");
            String email = scanner.next();
            scanner.nextLine();
            System.out.println("------------------------------------------------------------");

            System.out.print("Celular [" + existingStudent.getPhone() + "]: ");
            String phone = scanner.next();
            scanner.nextLine();
            System.out.println("------------------------------------------------------------");

            System.out.print("Tipo de Matricula [" + existingStudent.getTypeOfRegistration() + "]: ");
            String typeOfRegistration = scanner.next();
            scanner.nextLine();
            System.out.println("------------------------------------------------------------");

            String gratuity;

            if (typeOfRegistration.equals("Primera")) {
                gratuity = "Con Gratuidad";
            } else {
                gratuity = "Sin Gratuidad";
            }

            System.out.print("Calificacion [" + existingStudent.getGrade() + "]: ");
            String grade = scanner.next();
            scanner.nextLine();
            System.out.println("------------------------------------------------------------");

            System.out.print("Supletorio [" + existingStudent.getLastChance() + "]: ");
            String lastChance = scanner.next();
            scanner.nextLine();
            System.out.println("------------------------------------------------------------");

            Student updatedStudent = new Student(dni, name, lastName, careerCode, email, phone, typeOfRegistration, grade, lastChance, gratuity);
            Updater.updateStudent(fileName, updatedStudent);
        }
        pause(scanner);
    }

    public void deleteStudent(Scanner scanner, String fileName) {
        System.out.println("============================================================");
        System.out.print("Introduzca la Cedula del Estudiante a Eliminar: ");
        String dni = scanner.next();
        System.out.println("============================================================");
        Student student = Searcher.findStudentByDNI(fileName, dni);
        scanner.nextLine();
        Eraser.deleteStudent(fileName, dni);
        pause(scanner);
    }

    public void findStudent(Scanner scanner, String fileName) {
        System.out.println("============================================================");
        System.out.print("Introduzca la cedula del Estudiante: ");
        String dni = scanner.next();
        System.out.println("============================================================");
        scanner.nextLine();
        System.out.println("Curso: " + fileName);
        Student student = Searcher.findStudentByDNI(fileName, dni);
        System.out.println("------------------------------------------------------------");
        if (student != null) {
            System.out.println("Estudiante encontrado: \n" + student);
            System.out.println("------------------------------------------------------------");
        }
        pause(scanner);
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

    private static void pause(Scanner scanner) {
        System.out.print("Pulse Enter para continuar...\n");
        scanner.nextLine();
    }

}
