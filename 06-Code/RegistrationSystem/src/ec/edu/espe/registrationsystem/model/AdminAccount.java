/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.registrationsystem.model;

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
    public void createTutorAccount(){
        
    }
    public void addStudentsToACourse(){
    
    }
    
    public void addTutorsToACourse(){
    
    }
    
}
