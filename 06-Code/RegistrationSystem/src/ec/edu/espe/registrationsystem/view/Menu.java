package ec.edu.espe.registrationsystem.view;

import ec.edu.espe.registrationsystem.model.Student;
import utils.Reader;
import utils.FileManager;
import utils.Eraser;
import utils.Searcher;
import utils.Updater;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        String fileName = "";
        Scanner scanner = new Scanner(System.in);
        

        boolean exit = false;

        while (!exit) {

            System.out.println("Seleccione quién está usando el sistema:");
            System.out.println("1. Estudiantes");
            System.out.println("2. Personal administrativo");
            System.out.println("3. Profesores");
            System.out.println("4. Salir");
            
            System.out.print("\nIntroduzca su selección: ");
            int userType = scanner.nextInt();
            scanner.nextLine();

            switch (userType) {
                case 1 -> {
                    System.out.print("\nIntroduzca el Curso: ");
                    fileName = scanner.next();
                    manageStudents(scanner, fileName);
                }
                case 2 -> {
                    System.out.print("\nIntroduzca el Curso: ");
                    fileName = scanner.next();
                    manageAdminStaff(scanner, fileName);
                }
                case 3 -> manageProfessors(scanner);
                case 4 -> exit = true;
                default -> System.out.println("Selección inválida. Por favor, inténtelo de nuevo.");
            }
        }
    }

        private static void manageProfessors(Scanner scanner) {
        // Implementar gestión de profesores aquí
        System.out.println("Funcionalidad para Profesores no implementada.");
    }
        
    private static void manageStudents(Scanner scanner, String fileName) {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nSistema para Estudiantes:");
            System.out.println("1. Encontrar Estudiantes");
            System.out.println("2. Volver al menú principal");

            System.out.print("\nIntroduzca su selección: ");
            int operation = scanner.nextInt();
            scanner.nextLine();

            switch (operation) {
                case 1 -> findStudent(scanner, fileName);
                case 2 -> exit = true;
                default -> System.out.println("Selección inválida. Por favor, inténtelo de nuevo.");
            }
            if (!exit) {
                pause(scanner);
            }
        }
    }

    private static void manageAdminStaff(Scanner scanner, String fileName) {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nEscoja una operación:");
            System.out.println("1. Añadir Estudiante");
            System.out.println("2. Visualizar Estudiantes");
            System.out.println("3. Modificar Estudiantes");
            System.out.println("4. Eliminar Estudiante");
            System.out.println("5. Encontrar Estudiantes por Cédula");
            System.out.println("6. Salir");

            System.out.print("\nIntroduzca su selección: ");
            int operation = scanner.nextInt();
            scanner.nextLine();

            switch (operation) {
                case 1 -> addStudents(scanner, fileName);
                case 2 -> readStudents(fileName);
                case 3 -> updateStudent(scanner, fileName);
                case 4 -> deleteStudent(scanner, fileName);
                case 5 -> findStudent(scanner, fileName);
                case 7 -> exit = true;
                case 6 -> exit = true;

                default -> System.out.println("Selección inválida. Por favor, inténtelo de nuevo.");
            }
        }
    }

    private static void addStudents(Scanner scanner, String fileName) {
        System.out.print("\nCuántos estudiantes quiere agregar?: ");
        int studentNumber = scanner.nextInt();
        scanner.nextLine();

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

            System.out.print("Tipo de Matricula: ");
            String typeOfRegistration = scanner.next();

            System.out.print("Calificación: ");
            String grade = scanner.next();

            System.out.print("Supletorio: ");
            String lastChance = scanner.next();

            Student student = new Student(dni, name, lastName, careerCode, email, phone, typeOfRegistration, grade, lastChance);
            FileManager.FileSave(student.toString(), fileName);
        }
    }

    private static void readStudents(String fileName) {
        List<Student> students = Reader.readStudents(fileName);
        System.out.println("\nLista de Estudiantes:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void updateStudent(Scanner scanner, String fileName) {
        System.out.print("\nIntroduzca la Cédula del Estudiante a Editar: ");
        String dni = scanner.next();
        scanner.nextLine();
        Student existingStudent = Searcher.findStudentByDNI(fileName, dni);

        if (existingStudent != null) {
            System.out.println("\nEditar la Información del Estudiante");

            System.out.print("Nombres [" + existingStudent.getName() + "]: ");
            String name = scanner.next();
            scanner.nextLine();

            System.out.print("Apellidos [" + existingStudent.getLastName() + "]: ");
            String lastName = scanner.next();
            scanner.nextLine();

            System.out.print("Código de Carrera [" + existingStudent.getCareerCode() + "]: ");
            String careerCode = scanner.next();
            scanner.nextLine();

            System.out.print("Email [" + existingStudent.getEmail() + "]: ");
            String email = scanner.next();
            scanner.nextLine();

            System.out.print("Celular [" + existingStudent.getPhone() + "]: ");
            String phone = scanner.next();
            scanner.nextLine();

            System.out.print("Tipo de Matricula [" + existingStudent.getTypeOfRegistration() + "]: ");
            String typeOfRegistration = scanner.next();
            scanner.nextLine();

            System.out.print("Calificación [" + existingStudent.getGrade() + "]: ");
            String grade = scanner.next();
            scanner.nextLine();

            System.out.print("Supletorio [" + existingStudent.getLastChance() + "]: ");
            String lastChance = scanner.next();
            scanner.nextLine();

            Student updatedStudent = new Student(dni, name, lastName, careerCode, email, phone, typeOfRegistration, grade, lastChance);
            Updater.updateStudent(fileName, updatedStudent);
        } else {
            System.out.println("Estudiante con Cédula: " + dni + " no encontrado.");
        }
    }

    private static void deleteStudent(Scanner scanner, String fileName) {
        System.out.print("\nIntroduzca la Cédula del Estudiante a Eliminar: ");
        String dni = scanner.next();
        scanner.nextLine();
        Eraser.deleteStudent(fileName, dni);
    }

    private static void findStudent(Scanner scanner, String fileName) {
        System.out.print("\nIntroduzca la Cédula del Estudiante a Buscar: ");
        String dni = scanner.next();
        scanner.nextLine();
        Student student = Searcher.findStudentByDNI(fileName, dni);
        System.out.println(fileName);
        if (student != null) {
            System.out.println("Estudiante encontrado: " + student);
        } else {
            System.out.println("Estudiante con Cédula " + dni + " No Encontrado.");
        }
    }



    private static void pause(Scanner scanner) {
        System.out.print("\nPulse Enter para continuar...");
        scanner.nextLine();
    }
}
