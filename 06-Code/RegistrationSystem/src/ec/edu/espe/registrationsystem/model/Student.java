package ec.edu.espe.registrationsystem.model;

import java.util.Scanner;

/**
 *
 * @author Logic Legion, DCCO-ESPE
 */
public class Student {

    private String dni;
    private String name;
    private String lastName;
    private String careerCode;
    private String email;
    private String phone;
    private String typeOfRegistration;
    private String grade;
    private String lastChance;
    private String gratuity;

    public Student(String dni, String name, String lastName, String careerCode, String email, String phone, String typeOfRegistration, String grade, String lastChance, String gratuity) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.careerCode = careerCode;
        this.email = email;
        this.phone = phone;
        this.typeOfRegistration = typeOfRegistration;
        this.grade = grade;
        this.lastChance = lastChance;
        this.gratuity = gratuity;
    }

    @Override
    public String toString() {
        return dni + "," + name + "," + lastName + "," + careerCode + "," + email + "," + phone + "," + typeOfRegistration + "," + grade + "," + lastChance + "," + gratuity;
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCareerCode() {
        return careerCode;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getTypeOfRegistration() {
        return typeOfRegistration;
    }

    public String getGrade() {
        return grade;
    }

    public String getLastChance() {
        return lastChance;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCareerCode(String careerCode) {
        this.careerCode = careerCode;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setTypeOfRegistration(String typeOfRegistration) {
        this.typeOfRegistration = typeOfRegistration;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setLastChance(String lastChance) {
        this.lastChance = lastChance;
    }

    public String getGratuity() {
        return gratuity;
    }

    public void setGratuity(String gratuity) {
        this.gratuity = gratuity;
    }
    

}
