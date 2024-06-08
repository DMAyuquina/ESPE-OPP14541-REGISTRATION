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

public class ManagerMenu {
    

    public static void callMainMenu() {

        String fileName = "";
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("============================================================");
            System.out.println("        INSTITUTO TECNOLOGICO SUPERIOR BOLIVAR V0.12");
            System.out.println("============================================================");
            System.out.println("SISTEMA DE MATRICULAS DE ESTUDIANTES");
            System.out.println("------------------------------------------------------------");

            System.out.println("Seleccione un usuario:");
            System.out.println("------------------------------------------------------------");
            System.out.println("1. Estudiantes");
            System.out.println("2. Personal administrativo");
            System.out.println("3. Profesores");
            System.out.println("4. Salir");
            System.out.println("------------------------------------------------------------");

            System.out.print(">>");
            int userType = scanner.nextInt();
            scanner.nextLine();
            if (userType != 4) {
                System.out.println("\n============================================================");
                System.out.print("Introduzca el Curso: ");
                fileName = scanner.next();
                System.out.println("============================================================\n");
            }

            switch (userType) {
                case 1 -> {
                    manageStudents(scanner, fileName);
                }
                case 2 -> {
                    manageAdminStaff(scanner, fileName);
                }
                case 3 -> {
                    manageProfessors(scanner, fileName);
                }
                case 4 ->
                    exit = true;
                default ->
                    System.out.println("Seleccion invalida. Por favor, intentelo de nuevo.");
            }
        }
    }

    private static void manageProfessors(Scanner scanner, String fileName) {
        boolean exit = false;

        while (!exit) {
            System.out.println("============================================================");
            System.out.println("Sistema para Profesores:");
            System.out.println("============================================================");
            System.out.println("1. Encontrar Estudiantes");
            System.out.println("2. Modificar Estudiantes");
            System.out.println("3. Volver al menu principal");
            System.out.println("------------------------------------------------------------");

            System.out.print(">>");
            int operation = scanner.nextInt();
            scanner.nextLine();

            switch (operation) {
                case 1 ->
                    findStudent(scanner, fileName);

                case 2 ->
                    updateStudent(scanner, fileName);

                case 3 ->
                    exit = true;
                default ->
                    System.out.println("Seleccion invalida. Por favor, intentelo de nuevo.");
            }

        }
    }

    private static void manageStudents(Scanner scanner, String fileName) {
        boolean exit = false;

        while (!exit) {
            System.out.println("============================================================");
            System.out.println("Sistema para Estudiantes:");
            System.out.println("============================================================");
            System.out.println("1. Encontrar Estudiantes");
            System.out.println("2. Volver al menu principal");
            System.out.println("------------------------------------------------------------");

            System.out.print(">>");
            int operation = scanner.nextInt();
            scanner.nextLine();

            switch (operation) {
                case 1 ->
                    findStudent(scanner, fileName);
                case 2 ->
                    exit = true;
                default ->
                    System.out.println("Selección inválida. Por favor, inténtelo de nuevo.");
            }
        }
    }

    private static void manageAdminStaff(Scanner scanner, String fileName) {
        FileManager fileManager = new FileManager();
        
        boolean exit = false;
        while (!exit) {
            System.out.println("\n============================================================");
            System.out.println("Escoja una operacion:");
            System.out.println("============================================================");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Visualizar Estudiantes");
            System.out.println("3. Modificar Estudiantes");
            System.out.println("4. Eliminar Estudiante");
            System.out.println("5. Encontrar Estudiantes por Cedula");
            System.out.println("6. Salir");
            System.out.println("------------------------------------------------------------");
            System.out.print(">>");
            int operation = scanner.nextInt();
            scanner.nextLine();
            System.out.println("------------------------------------------------------------");

            switch (operation) {
                case 1 ->
                    fileManager.addStudents(scanner, fileName);
                case 2 ->
                    readStudents(scanner, fileName);
                case 3 ->
                    updateStudent(scanner, fileName);
                case 4 ->
                    deleteStudent(scanner, fileName);
                case 5 ->
                    findStudent(scanner, fileName);
                case 7 ->
                    exit = true;
                case 6 ->
                    exit = true;

                default ->
                    System.out.println("Selección invalida. Por favor, intentelo de nuevo.");
            }
        }
    }

    private static void readStudents(Scanner scanner, String fileName) {
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

    private static void updateStudent(Scanner scanner, String fileName) {
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

            System.out.print("Calificacion [" + existingStudent.getGrade() + "]: ");
            String grade = scanner.next();
            scanner.nextLine();
            System.out.println("------------------------------------------------------------");

            System.out.print("Supletorio [" + existingStudent.getLastChance() + "]: ");
            String lastChance = scanner.next();
            scanner.nextLine();
            System.out.println("------------------------------------------------------------");

            Student updatedStudent = new Student(dni, name, lastName, careerCode, email, phone, typeOfRegistration, grade, lastChance);
            Updater.updateStudent(fileName, updatedStudent);
        } 
        pause(scanner);
    }

    private static void deleteStudent(Scanner scanner, String fileName) {
        System.out.println("============================================================");
        System.out.print("Introduzca la Cedula del Estudiante a Eliminar: ");
        String dni = scanner.next();
        System.out.println("============================================================");
        Student student = Searcher.findStudentByDNI(fileName, dni);
        scanner.nextLine();
        Eraser.deleteStudent(fileName, dni);
        pause(scanner);
    }

    private static void findStudent(Scanner scanner, String fileName) {
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

    private static void pause(Scanner scanner) {
        System.out.print("Pulse Enter para continuar...\n");
        scanner.nextLine();
    }
}
