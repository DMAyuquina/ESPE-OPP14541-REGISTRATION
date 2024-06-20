package ec.edu.espe.registrationsystem.model;
import ec.edu.espe.registrationsystem.view.ManagerMenu;
import java.util.Scanner;

/**
 *
 * @author Logic Legion, DCCO-ESPE
 */

public class StudentAccount {
    Scanner scanner = new Scanner(System.in);
    String fileName = "";
    ManagerMenu manageMenu = new ManagerMenu();
    //Methods
    public void viewReport(){
        
        
        System.out.println("\n============================================================");
                    System.out.print("Introduzca el Curso: ");
                    fileName = scanner.next();
                    scanner.nextLine();
                    System.out.println("============================================================\n");
                    manageMenu.manageStudents(scanner, fileName);
                    
    }
}
