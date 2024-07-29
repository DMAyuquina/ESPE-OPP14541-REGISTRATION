package ec.edu.espe.registersystemmaven.model;

import java.util.Scanner;

/**
 *
 * @author Logic Legion, DCCO-ESPE
 */
public class Student {

    private String dni;
    private String names;
    private String lastNames;
    private String careerCode;
    private String email;
    private String phone;
    private String typeOfRegistration;
    private String GradeUnit1;
    private String GradeUnit2;
    private String LastChance;
    

    @Override
    public String toString() {
        return getDni() + "," + getNames() + "," + getLastNames() + "," + getCareerCode() + "," + getEmail() + "," + getPhone() + "," + getTypeOfRegistration()+ "," + getGradeUnit1() + "," + getGradeUnit2() + "," + getLastChance();
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
     * @return the careerCode
     */
    public String getCareerCode() {
        return careerCode;
    }

    /**
     * @param careerCode the careerCode to set
     */
    public void setCareerCode(String careerCode) {
        this.careerCode = careerCode;
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
     * @return the typeOfRegistration
     */
    public String getTypeOfRegistration() {
        return typeOfRegistration;
    }

    /**
     * @param typeOfRegistration the typeOfRegistration to set
     */
    public void setTypeOfRegistration(String typeOfRegistration) {
        this.typeOfRegistration = typeOfRegistration;
    }

    /**
     * @return the GradeUnit1
     */
    public String getGradeUnit1() {
        return GradeUnit1;
    }

    /**
     * @param GradeUnit1 the GradeUnit1 to set
     */
    public void setGradeUnit1(String GradeUnit1) {
        this.GradeUnit1 = GradeUnit1;
    }

    /**
     * @return the GradeUnit2
     */
    public String getGradeUnit2() {
        return GradeUnit2;
    }

    /**
     * @param GradeUnit2 the GradeUnit2 to set
     */
    public void setGradeUnit2(String GradeUnit2) {
        this.GradeUnit2 = GradeUnit2;
    }

    /**
     * @return the LastChance
     */
    public String getLastChance() {
        return LastChance;
    }

    /**
     * @param LastChance the LastChance to set
     */
    public void setLastChance(String LastChance) {
        this.LastChance = LastChance;
    }
    
    

}
