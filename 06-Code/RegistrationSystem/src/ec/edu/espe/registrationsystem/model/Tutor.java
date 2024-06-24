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
    private Career careers; 
    private String email;
    private String phone;
    private ArrayList<Course> codeCourses;

    @Override
    public String toString() {
        return "Tutor{" + "dni=" + dni + ", fullName=" + fullName + ", careers=" + careers + ", email=" + email + ", phone=" + phone + ", codeCourses=" + codeCourses + '}';
    }

    public Tutor(String dni, String fullName, Career careers, String email, String phone, ArrayList<Course> codeCourses) {
        this.dni = dni;
        this.fullName = fullName;
        this.careers = careers;
        this.email = email;
        this.phone = phone;
        this.codeCourses = codeCourses;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the careers
     */
    public Career getCareers() {
        return careers;
    }

    /**
     * @param careers the careers to set
     */
    public void setCareers(Career careers) {
        this.careers = careers;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the codeCourses
     */
    public ArrayList<Course> getCodeCourses() {
        return codeCourses;
    }

    /**
     * @param codeCourses the codeCourses to set
     */
    public void setCodeCourses(ArrayList<Course> codeCourses) {
        this.codeCourses = codeCourses;
    }

    

}
