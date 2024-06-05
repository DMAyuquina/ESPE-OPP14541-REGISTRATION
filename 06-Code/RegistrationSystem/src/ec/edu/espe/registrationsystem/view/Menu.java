package ec.edu.espe.registrationsystem.view;

import ec.edu.espe.registrationsystem.model.Student;
import utils.Reader;
import utils.FileManager;
import java.util.List;
import java.util.Scanner;
import utils.Eraser;
import utils.Searcher;
import utils.Updater;
import java.nio.charset.StandardCharsets;

/**
 *
 * @autor Logic Legion, DCCO-ESPE
 */

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8.name());
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
                case 1:
                    manageStudents(scanner);
                    break;
                case 2:
                    manageAdminStaff(scanner);
                    break;
                case 3:
                    manageProfessors(scanner);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Selección inválida. Por favor, inténtelo de nuevo.");
                    break;
            }
        }

        scanner.close();
    }

    private static void manageStudents(Scanner scanner) {
        String fileName = "students.txt"; // Puedes cambiar esto según sea necesario
        boolean exit = false;

    System.out.println("Visualizar Estudiantes");
    private static void findStudent(Scanner scanner, String fileName) {
        System.out.print("\nIntroduzca la Cédula del Estudiante a Buscar: ");
        String dni = scanner.nextLine();
        Student student = Searcher.findStudentByDNI(fileName, dni);
        if (student != null) {
            System.out.println("Estudiante encontrado: " + student);
        } else {
            System.out.println("Estudiante con Cédula " + dni + " No Encontrado.");
        }
    }

    private static void pause(Scanner scanner) {
        System.out.print("\nPresione Enter para continuar...");
        scanner.nextLine(); // Esperar a que el usuario presione Enter
    }
}
