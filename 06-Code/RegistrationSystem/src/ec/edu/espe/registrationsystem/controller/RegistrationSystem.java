package ec.edu.espe.registrationsystem.controller;

import ec.edu.espe.registrationsystem.model.Student;
import utils.Reader;
import utils.FileManager;
import java.util.List;
import java.util.Scanner;
import utils.Eraser;
import utils.Searcher;
import utils.Updater;

/**
 *
 * @author Logic Legion, DCCO-ESPE
 */

public class RegistrationSystem {

    public static void main(String[] args) {
        String fileName = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de Matriculas de Estidiantes Intituto Tecnologico Superior Bolivar V0.8");
        System.out.print("\nInroduzca el nombre del archivo: ");
        fileName = scanner.next();

        boolean exit = false;
        while (!exit) {
            System.out.println("\nEscoja una operación:");
            System.out.println("1. Añadir Estudiante");
            System.out.println("2. Visualizar Estudiantes");
            System.out.println("3. Modificar Estudiantes");
            System.out.println("4. Eliminar Estudiante ");
            System.out.println("5. Encontrar Estudiantes por Cédula");
            System.out.println("6. Salir");

            System.out.print("\nIntroduzca su selección: ");
            int operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    addStudents(scanner, fileName);
                    break;
                case 2:
                    readStudents(fileName);
                    break;
                case 3:
                    updateStudent(scanner, fileName);
                    break;
                case 4:
                    deleteStudent(scanner, fileName);
                    break;
                case 5:
                    findStudent(scanner, fileName);
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Selección Invalida. Porfavor Intentelo de Nuevo.");
                    break;
            }
        }
        scanner.close();
    }

    private static void addStudents(Scanner scanner, String fileName) {
        System.out.print("\nCuántos estudiantes quiere agregar?: ");
        int studentNumber = scanner.nextInt();

        for (int aux = 0; aux < studentNumber; aux++) {
            System.out.println("\nInformación del Estudiante Nuevo");

            System.out.print("Cédula: ");
            String dni = scanner.next();

            System.out.print("Nombres: ");
            String name = scanner.next();

            System.out.print("Apellidos: ");
            String lastName = scanner.next();

            System.out.print("Código de Carrera: ");
            String careerCode = scanner.next();

            System.out.print("Email: ");
            String email = scanner.next();

            System.out.print("Celular: ");
            String phone = scanner.next();

            Student student = new Student(dni, name, lastName, careerCode, email, phone);
            FileManager.FileSave(student.toString(), fileName);
        }
    }

    private static void readStudents(String fileName) {
        List<Student> students = Reader.readStudents(fileName);
        System.out.println("\nLista de Estudiante:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void updateStudent(Scanner scanner, String fileName) {
        System.out.print("\nIntroduzca la Cédula del Estudiante a Editar: ");
        String dni = scanner.next();
        Student existingStudent = Searcher.findStudentByDNI(fileName, dni);

        if (existingStudent != null) {
            System.out.println("\nEditar la Información del Estudiante");

            System.out.print("Nombres [" + existingStudent.getName() + "]: ");
            String name = scanner.next();

            System.out.print("Apellidos [" + existingStudent.getLastName() + "]: ");
            String lastName = scanner.next();

            System.out.print("Código de Carrera [" + existingStudent.getCareerCode() + "]: ");
            String careerCode = scanner.next();

            System.out.print("Email [" + existingStudent.getEmail() + "]: ");
            String email = scanner.next();

            System.out.print("Celular [" + existingStudent.getPhone() + "]: ");
            String phone = scanner.next();

            Student updatedStudent = new Student(dni, name, lastName, careerCode, email, phone);
            Updater.updateStudent(fileName, updatedStudent);
        } else {
            System.out.println("Estudiante con Cédula: " + dni + " no encontrado.");
        }
    }

    private static void deleteStudent(Scanner scanner, String fileName) {
        System.out.print("\nIntroduzca la Cédula del Estudiante a Eliminar: ");
        String dni = scanner.next();
        Eraser.deleteStudent(fileName, dni);
    }

    private static void findStudent(Scanner scanner, String fileName) {
        System.out.print("\nIntroduzca la Cédula del Estudiante a Buscar: ");
        String dni = scanner.next();
        Student student = Searcher.findStudentByDNI(fileName, dni);
        if (student != null) {
            System.out.println("Estudiante encontrado: " + student);
        } else {
            System.out.println("Estudiante con Cédula " + dni + " No Encontrado.");
        }
    }
}
