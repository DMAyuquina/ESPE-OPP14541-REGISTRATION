package ec.edu.espe.registrationsystem.view;

import utils.FileManager;
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
        FileManager fileManager = new FileManager();
        boolean exit = false;

        while (!exit) {
            System.out.println("============================================================");
            System.out.println("Sistema para Profesores:");
            System.out.println("============================================================");
            System.out.println("1. Encontrar Estudiantes");
            System.out.println("2. Modificar Nota Estudiantes");
            System.out.println("3. Volver al menu principal");
            System.out.println("------------------------------------------------------------");

            System.out.print(">>");
            int operation = scanner.nextInt();
            scanner.nextLine();

            switch (operation) {
                case 1 ->
                    fileManager.findStudent(scanner, fileName);

                case 2 ->
                    fileManager.updateStudent(scanner, fileName, false);

                case 3 ->
                    exit = true;
                default ->
                    System.out.println("Seleccion invalida. Por favor, intentelo de nuevo.");
            }

        }
    }

    private static void manageStudents(Scanner scanner, String fileName) {

        FileManager fileManager = new FileManager();
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
                    fileManager.findStudent(scanner, fileName);
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
                    fileManager.readStudents(scanner, fileName);
                case 3 ->
                    fileManager.updateStudent(scanner, fileName, true);
                case 4 ->
                    fileManager.deleteStudent(scanner, fileName);
                case 5 ->
                    fileManager.findStudent(scanner, fileName);
                case 7 ->
                    exit = true;
                case 6 ->
                    exit = true;

                default ->
                    System.out.println("Selección invalida. Por favor, intentelo de nuevo.");
            }
        }
    }

}
