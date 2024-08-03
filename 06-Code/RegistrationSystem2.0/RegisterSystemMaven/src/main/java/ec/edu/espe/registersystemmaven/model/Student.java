package ec.edu.espe.registersystemmaven.model;

import java.util.Date;

/**
 *
 * @author Logic Legion, DCCO-ESPE
 */
public class Student {

    private String dni;
    private String names;
    private String lastNames;
    private String genre;
    private String email;
    private String phone;
    private Registration registration;
    private Grade grade;
    private Date bornOnDate;
    private Career career;
    private float Assistence;

    public Student() {
    }
    
    public Student(String dni, String names, String lastNames, String genre, String email, String phone, Registration registration, Grade grade, Date bornOnDate, Career career, float Assistence) {
        this.dni = dni;
        this.names = names;
        this.lastNames = lastNames;
        this.genre = genre;
        this.email = email;
        this.phone = phone;
        this.registration = registration;
        this.grade = grade;
        this.bornOnDate = bornOnDate;
        this.career = career;
        this.Assistence = Assistence;
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
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
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
     * @return the registration
     */
    public Registration getRegistration() {
        return registration;
    }

    /**
     * @param registration the registration to set
     */
    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

    /**
     * @return the grade
     */
    public Grade getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    /**
     * @return the bornOnDate
     */
    public Date getBornOnDate() {
        return bornOnDate;
    }

    /**
     * @param bornOnDate the bornOnDate to set
     */
    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
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
     * @return the Assistence
     */
    public float getAssistence() {
        return Assistence;
    }

    /**
     * @param Assistence the Assistence to set
     */
    public void setAssistence(float Assistence) {
        this.Assistence = Assistence;
    }


}
