package ec.edu.espe.registersystemmaven.model;

import java.util.ArrayList;

/**
 *
 * @author LogicLegion, DCCO-ESPE
 */
public class Tutor {
    
    private String id;
    private String names;
    private String lastNames;
    private String user;
    private String password;
    private String phone;
    private String email;
    private ArrayList<Course> courses;
    private Career career;

    public Tutor() {
    }
    
    public Tutor(String id, String names, String lastNames, String user, String password, String phone, String email, Career career, ArrayList<Course> courses) {
        this.id = id;
        this.names = names;
        this.lastNames = lastNames;
        this.user = user;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.career = career;
        this.courses = courses;
    }
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the names
     */
    public String getNames() {
        return names;
    }

    /**
     * @param names the names to set
     */
    public void setNames(String names) {
        this.names = names;
    }

    /**
     * @return the lastNames
     */
    public String getLastNames() {
        return lastNames;
    }

    /**
     * @param lastNames the lastNames to set
     */
    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
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
     * @return the career
     */
    public Career getCareer() {
        return career;
    }

    /**
     * @param career the career to set
     */
    public void setCareer(Career career) {
        this.career = career;
    }

    /**
     * @return the courses
     */
    public ArrayList<Course> getCourses() {
        return courses;
    }

    /**
     * @param courses the courses to set
     */
    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
    
}
