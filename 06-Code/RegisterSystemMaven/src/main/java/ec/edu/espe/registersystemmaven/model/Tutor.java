/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.registersystemmaven.model;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class Tutor {
    
    private String id;
    private String names;
    private String lastNames;
    private String phone;
    private String email;
    private String careerCode;
    private String career;

    public Tutor(String id, String names, String lastNames, String phone, String email, String careerCode, String career) {
        this.id = id;
        this.names = names;
        this.lastNames = lastNames;
        this.phone = phone;
        this.email = email;
        this.careerCode = careerCode;
        this.career = career;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
