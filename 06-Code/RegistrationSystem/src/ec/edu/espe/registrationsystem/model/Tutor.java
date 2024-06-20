package ec.edu.espe.registrationsystem.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Logic Legion DCCO-ESPE
 */
public class Tutor {
    private String dni;
    private String fullName;
    private ArrayList<Career> careers; 
    private String email;
    private String phone;
    private ArrayList<Course> codeCourses;

    public Tutor(String dni, String fullName, ArrayList<Career> careers, String email, String phone, ArrayList<Course> codeCourses) {
        this.dni = dni;
        this.fullName = fullName;
        this.careers = careers;
        this.email = email;
        this.phone = phone;
        this.codeCourses = codeCourses;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public ArrayList<Career> getCareers() {
        return careers;
    }

    public void setCareers(ArrayList<Career> careers) {
        this.careers = careers;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Course> getCodeCourses() {
        return codeCourses;
    }

    public void setCodeCourses(ArrayList<Course> codeCourses) {
        this.codeCourses = codeCourses;
    }

    @Override
    public String toString() {
        return "Tutor{" + "dni=" + dni + ", fullName=" + fullName + ", careers=" + careers + ", email=" + email + ", phone=" + phone + ", codeCourses=" + codeCourses + '}';
    }

}
