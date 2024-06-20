package ec.edu.espe.registrationsystem.view;

import ec.edu.espe.registrationsystem.model.AdminAccount;
import ec.edu.espe.registrationsystem.model.StudentAccount;
import utils.FileManager;
import java.util.Scanner;

/**
 *
 * @author Logic Legion, DCCO-ESPE
 */

public class ManagerMenu {

    public static boolean loginAccounts(String password, String account, Scanner scanner) {
        int i = 0;
        String passComprobation = "", userComprobation = "";
        boolean comprobation = true;

        while (i < 3 && comprobation) {
            i++;
            System.out.println("==============================================");
            System.out.println("            INGRESO DE USUARIO");
            System.out.println("==============================================");
            System.out.print("Usuario: ");
            userComprobation = scanner.nextLine();
            System.out.print("Clave: ");
            passComprobation = scanner.nextLine();
            
            if (account.equals("LogicLegion")) {
                if (userComprobation.equals(account) && passComprobation.equals(password)) {
                    System.out.println("Ingreso exitoso!\n");
                    FileManager.pause(scanner);
                    comprobation = false;
                } else {
                    System.out.println("Usuario o clave mal ingresada. Intente de nuevo\n");
                    FileManager.pause(scanner);
                }
            } else {
                AdminAccount admin = new AdminAccount();
                comprobation = !admin.validateTutorLogin(userComprobation, passComprobation);
                if(!comprobation){System.out.println("Ingreso Exitoso");}
                else{System.out.println("Usuario o clave mal ingresada. Intente de nuevo\n");}
            }

        }
        return comprobation;

    }

    public static void callMainMenu() {

        AdminAccount adminUser = new AdminAccount();
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

            switch (userType) {
                case 1 -> {
                    StudentAccount studentAccount = new StudentAccount();
                    studentAccount.viewReport();
                }
                case 2 -> {
                    exit = loginAccounts(adminUser.getAdminPassword(), adminUser.getAdminUser(), scanner);
                    if (exit == true) {
                        exit = false;
                        break;
                    }
                    
                    System.out.println("\n============================================================");
                    System.out.print("Introduzca el Curso: ");
                    fileName = scanner.next();
                    scanner.nextLine();
                    System.out.println("============================================================\n");
                    manageAdminStaff(scanner, fileName);
                }
                case 3 -> {

                    exit = loginAccounts("", "", scanner);
                    if (exit == true) {
                        exit = false;
                        break;
                    }

                    System.out.println("\n============================================================");
                    System.out.print("Introduzca el Curso: ");
                    fileName = scanner.next();
                    scanner.nextLine();
                    System.out.println("============================================================\n");
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
        System.out.println("3. Cambiar de Curso");
        System.out.println("4. Volver al menu principal");
        System.out.println("------------------------------------------------------------");
        System.out.print(">>");
        int operation = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (operation) {
            case 1:
                fileManager.findStudent(scanner, fileName);
                break;
            case 2:
                fileManager.updateStudent(scanner, fileName, false);
                break;
            case 3:
                System.out.print("Introduzca el Curso: ");
                fileName = scanner.nextLine();
                break;
            case 4:
                exit = true;
                break;
            default:
                System.out.println("Selección invalida. Por favor, intentelo de nuevo.");
                break;
        }
    }
}


    public void manageStudents(Scanner scanner, String fileName) {

        FileManager fileManager = new FileManager();
        boolean exit = false;

        while (!exit) {
            System.out.println("============================================================");
            System.out.println("Sistema para Estudiantes:");
            System.out.println("============================================================");
            System.out.println("1. Encontrar Estudiantes");
             System.out.println("2. Cambiar de Curso");
            System.out.println("3. Volver");
            System.out.println("------------------------------------------------------------");
            System.out.print(">>");

            int operation = scanner.nextInt();
            scanner.nextLine(); 

            switch (operation) {
                case 1 -> {
                    fileManager.findStudent(scanner, fileName);
                }
                case 2 -> {
                    System.out.print("Introduzca el Curso: ");
                    fileName = scanner.nextLine();
                }
                case 3 -> exit = true;
                default -> System.out.println("Selección inválida. Por favor, inténtelo de nuevo.");
            }
        }
    }


    private static void manageAdminStaff(Scanner scanner, String fileName) {
        AdminAccount adminUser = new AdminAccount();

        boolean exit = false;
        FileManager fileManager = new FileManager();

        while (!exit) {
            System.out.println("\n============================================================");
            System.out.println("Escoja una operacion:");
            System.out.println("============================================================");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Visualizar Estudiantes");
            System.out.println("3. Modificar Estudiantes");
            System.out.println("4. Eliminar Estudiante");
            System.out.println("5. Encontrar Estudiantes por Cedula");
            System.out.println("6. Cambiar de Curso");
            System.out.println("7. Salir");
            System.out.println("------------------------------------------------------------");
            System.out.print(">>");

            int operation = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de nextInt()

            switch (operation) {
                case 1:
                    adminUser.addStudents();
                    break;
                case 2:
                    adminUser.readStudents(fileName);
                    break;
                case 3:
                    adminUser.updateStudent();
                    break;
                case 4:
                    adminUser.deleteStudent();
                    break;
                case 5:
                    adminUser.findStudent();
                    break;
                case 6:
                    System.out.print("Introduzca el Curso: ");
                    fileName = scanner.nextLine();
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Selección invalida. Por favor, intentelo de nuevo.");
                    break;
            }
        }
    }

}
