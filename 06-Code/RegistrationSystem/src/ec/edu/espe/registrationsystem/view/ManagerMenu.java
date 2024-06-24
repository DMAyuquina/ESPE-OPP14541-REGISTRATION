package ec.edu.espe.registrationsystem.view;

import ec.edu.espe.registrationsystem.model.AdminAccount;
import ec.edu.espe.registrationsystem.model.Career;
import ec.edu.espe.registrationsystem.model.Course;
import ec.edu.espe.registrationsystem.model.StudentAccount;
import ec.edu.espe.registrationsystem.model.StudentReport;
import ec.edu.espe.registrationsystem.model.Tutor;
import ec.edu.espe.registrationsystem.model.TutorAccount;
import utils.FileManager;
import java.util.Scanner;
import utils.Validation;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @autor Logic Legion, DCCO-ESPE
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
                if (!comprobation) {
                    System.out.println("Ingreso Exitoso");
                } else {
                    System.out.println("Usuario o clave mal ingresada. Intente de nuevo\n");
                }
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
            System.out.println("2. Profesores");
            System.out.println("3. Personal Administrativo");
            System.out.println("4. Salir");
            System.out.println("------------------------------------------------------------");

            System.out.print(">>");
            int userType = 0;
            userType = Validation.validationOfInt(userType, scanner);

            if (userType != 0) {
                switch (userType) {
                    case 1 -> {
                        System.out.println("\n============================================================");
                        System.out.print("Introduzca el Curso: ");
                        fileName = scanner.next();
                        scanner.nextLine();
                        System.out.println("============================================================\n");
                        manageStudents(scanner, fileName);
                        
                    }
                    case 2 -> {
                        exit = loginAccounts("", "", scanner);
                        if (exit) {
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
                    case 3 -> {
                        exit = loginAccounts(adminUser.getAdminPassword(), adminUser.getAdminUser(), scanner);
                        if (exit) {
                            exit = false;
                            break;
                        }

                        System.out.println("\n============================================================");
                        System.out.println("Seleccione una opción:");
                        System.out.println("1. Administrar Estudiantes");
                        System.out.println("2. Administrar Tutores");
                        System.out.println("============================================================");
                        int option = scanner.nextInt();
                        scanner.nextLine(); 

                        if (option == 1) {
                            System.out.print("Introduzca el Curso: ");
                            fileName = scanner.next();
                            scanner.nextLine(); 
                            System.out.println("============================================================\n");
                            manageAdminStaff(scanner, fileName); 
                        } else if (option == 2) {
                            System.out.println("Abriendo archivo de tutores...");
                            String tutorsFileName = "tutors.csv";
                            manageTutors(tutorsFileName); 
                        } else {
                            System.out.println("Opción no válida.");
                        }
                    }
                    case 4 -> exit = true;
                    default -> {
                        System.out.println("Seleccion invalida. Por favor, intentelo de nuevo.");
                        FileManager.pause(scanner);
                    }
                }
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
            System.out.println("3. Ver Reporte de estudiantes");
            System.out.println("4. Cambiar de Curso");
            System.out.println("5. Volver al menu principal");
            System.out.println("------------------------------------------------------------");
            System.out.print(">>");
            int operation = 0;

            operation = Validation.validationOfInt(operation, scanner);

            if (operation != 0) {
                switch (operation) {
                    case 1:
                        fileManager.findStudent(scanner, fileName);
                        break;
                    case 2:
                        fileManager.updateStudent(scanner, fileName, false);
                        break;
                    case 3:
                        TutorAccount.viewReport(scanner, fileName);
                        break;
                    case 4:
                        System.out.print("Introduzca el Curso: ");
                        fileName = scanner.nextLine();
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Seleccion invalida. Por favor, intentelo de nuevo.");
                        FileManager.pause(scanner);
                }
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

            int operation = 0;

            operation = Validation.validationOfInt(operation, scanner);

            if (operation != 0) {
                switch (operation) {
                    case 1:
                        adminUser.addStudents(scanner, fileName);
                        break;
                    case 2:
                        adminUser.viewReport(scanner, fileName);
                        break;
                    case 3:
                        adminUser.updateStudent(scanner, fileName);
                        break;
                    case 4:
                        adminUser.deleteStudent(scanner, fileName);
                        break;
                    case 5:
                        adminUser.findStudent(scanner, fileName);
                        break;
                    case 6:
                        System.out.print("Introduzca el Curso: ");
                        fileName = scanner.nextLine();
                        break;
                    case 7:
                        exit = true;
                        break;
                    default:
                        System.out.println("Seleccion invalida. Por favor, intentelo de nuevo.");
                        FileManager.pause(scanner);
                        break;
                }
            }
        }
    }

    private static void manageTutors(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tutorDetails = line.split(",");
                System.out.println("Tutor: " + String.join(", ", tutorDetails));
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }


    public static void manageStudents(Scanner scanner, String fileName) {
       FileManager fileManager = new FileManager();
        boolean exit = false;

        while (!exit) {
            System.out.println("============================================================");
            System.out.println("Sistema para Estudiantes:");
            System.out.println("============================================================");
            System.out.println("1. Ver reporte de estudiante");
            System.out.println("2. Cambiar de Curso");
            System.out.println("3. Volver");
            System.out.println("------------------------------------------------------------");
            System.out.print(">>");

            int operation = 0;

            operation = Validation.validationOfInt(operation, scanner);

            if (operation != 0) {
                switch (operation) {
                    case 1 -> {
                        StudentAccount.viewReport(scanner, fileName);
                    }
                    case 2 -> {
                        System.out.print("Introduzca el Curso: ");
                        fileName = scanner.nextLine();
                    }
                    case 3 ->
                        exit = true;
                    default ->{
                        System.out.println("Seleccion invalida. Por favor, intentelo de nuevo.");
                        FileManager.pause(scanner);                }
                }
            }
        }
    } 
}
