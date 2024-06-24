package ec.edu.espe.registrationsystem.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import utils.FileManager;

/**
 *
 * @author LogicLegion, DCCO-ESPE
 */

public class AdminAccount {

    private final String adminUser = "LogicLegion";
    private final String adminPassword = "14541";
    FileManager fileManager = new FileManager();
    
    @Override
    public String toString() {
        return "AdminAccount{" + "adminUser=" + adminUser + ", adminPassword=" + adminPassword + '}';
    }

    public String getAdminUser() {
        return adminUser;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    //Methods

    public void createTutorAccount(String tutorUser, String tutorPassword) {
        TutorAccount tutor = new TutorAccount(tutorUser, tutorPassword);
        String data = tutor.getTutorUser() + "," + tutor.getTutorPasword();
        FileManager.FileSave(data, "tutors");
    }

    public boolean validateTutorLogin(String tutorUser, String tutorPassword) {
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader("tutors.csv"))) {
            while ((line = reader.readLine()) != null) {
                String[] credentials = line.split(",");
                if (credentials[0].equals(tutorUser) && credentials[1].equals(tutorPassword)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void addStudents(Scanner scanner, String fileName) {
        fileManager.addStudents(scanner, fileName);
    }

    public void readStudents(Scanner scanner, String fileName) {
        fileManager.readStudents(scanner, fileName);
    }

    public void updateStudent(Scanner scanner, String fileName) {
        fileManager.updateStudent(scanner, fileName, true);
    }
    
    public void deleteStudent(Scanner scanner, String fileName) {
        fileManager.deleteStudent(scanner, fileName);
    }
    
    public void findStudent(Scanner scanner, String fileName) {
        fileManager.findStudent(scanner, fileName);
    }
    
}
