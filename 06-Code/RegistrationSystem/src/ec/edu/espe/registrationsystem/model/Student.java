package ec.edu.espe.registrationsystem.model;

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
    
    public Student(String dni, String name, String lastName, String careerCode, String email, String phone) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.careerCode = careerCode;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return dni + "," + name + "," + lastName + "," + careerCode + "," + email + "," + phone;
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

    
            
            
    
}