package ec.edu.espe.registrationsystem.model;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Logic Legion, DCCO-ESPE
 */

public class TutorAccount implements Serializable{

    private String tutorUser;
    private String tutorPasword;

    public TutorAccount(String tutorUser, String tutorPasword) {
        this.tutorUser = tutorUser;
        this.tutorPasword = tutorPasword;
    }

    public String getTutorUser() {
        return tutorUser;
    }

    public void setTutorUser(String tutorUser) {
        this.tutorUser = tutorUser;
    }

    public String getTutorPasword() {
        return tutorPasword;
    }

    public void setTutorPasword(String tutorPasword) {
        this.tutorPasword = tutorPasword;
    }
    
    public static void viewReport(Scanner scanner, String fileName) {
        StudentReport.generateReport(scanner, fileName);
    }
}
