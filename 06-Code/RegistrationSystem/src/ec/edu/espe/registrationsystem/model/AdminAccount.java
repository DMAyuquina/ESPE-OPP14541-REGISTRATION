/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.registrationsystem.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import utils.FileManager;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class AdminAccount {
    private String adminUser;
    private String adminPassword;
    private Student student[];
    private Tutor tutor[];

    public AdminAccount(String adminUser, String adminPassword, Student[] student, Tutor[] tutor) {
        this.adminUser = adminUser;
        this.adminPassword = adminPassword;
        this.student = student;
        this.tutor = tutor;
    }

    @Override
    public String toString() {
        return "AdminAccount{" + "adminUser=" + adminUser + ", adminPassword=" + adminPassword + ", student=" + student + ", tutor=" + tutor + '}';
    }
    
    
    public String getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(String adminUser) {
        this.adminUser = adminUser;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public Tutor[] getTutor() {
        return tutor;
    }

    public void setTutor(Tutor[] tutor) {
        this.tutor = tutor;
    }
    
    //Methods
    
    public void createTutorAccounts() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántas cuentas de tutor desea crear? ");
        int numberOfTutors = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        for (int i = 0; i < numberOfTutors; i++) {
            System.out.println("Ingrese los datos para el tutor " + (i + 1));
            System.out.print("Nombre de usuario: ");
            String tutorUser = scanner.nextLine();
            System.out.print("Contraseña: ");
            String tutorPassword = scanner.nextLine();
            createTutorAccount(tutorUser, tutorPassword);
        }
    }
    
    public void createTutorAccount(String tutorUser, String tutorPassword) {
        TutorAccount tutor = new TutorAccount(tutorUser, tutorPassword, new StudentGrade[0]);
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

    public void addStudentsToACourse(){
    
    }
    
    public void addTutorsToACourse(){
    
    }
    
}
