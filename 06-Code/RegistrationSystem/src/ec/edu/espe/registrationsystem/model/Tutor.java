package ec.edu.espe.registrationsystem.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import utils.FileManager;
import utils.Reader;
import utils.Searcher;
import utils.Validation;
import static utils.Validation.validationDni;

/**
 *
 * @author Logic Legion DCCO-ESPE
 */
public class Tutor {

    private String dni;
<<<<<<< HEAD
    private String name;
    private String lastName;
    private String careerCode;
=======
    private String fullName;
    private Career careers; 
>>>>>>> fce15ebb908ca647d97dc58e259ff8963e72245b
    private String email;
    private String phone;

<<<<<<< HEAD
    public Tutor(String dni, String name, String lastName, String careerCode, String email, String phone, String value6) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.careerCode = careerCode;
        this.email = email;
        this.phone = phone;
    }

    public Tutor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public void addTutors(String fileName) {
        Scanner scanner = new Scanner(System.in);
        int tutorNumber = 0;
        do {
            System.out.println("\n============================================================");
            System.out.print("Cuantos profesores quiere agregar?: ");
            tutorNumber = Validation.validationOfInt(tutorNumber, scanner);

        } while (tutorNumber <= 0);
        System.out.println("============================================================");

        for (int aux = 0; aux < tutorNumber; aux++) {
            System.out.println("Informacion del Profesor Nuevo");
            String dni;
            Student tutor2 = null;
            boolean validation = false;
            boolean dniValidation = false;

            do {
                System.out.println("------------------------------------------------------------");

                System.out.print("Cedula: ");
                dni = scanner.next();
                dniValidation = Validation.validationOfCharacter(dni);

                if (!dniValidation) {
                    tutor2 = Searcher.findStudentByDNI(fileName, dni);

                    boolean validationNumbersDni = Validation.validationOfCharacter(dni);
                    if (!validationNumbersDni) {
                        if (dni.length() == 10) {
                            if (!validationDni(dni.length(), dni) || tutor2 != null) {
                                System.out.println("La cedula ingresada no es valida o ya existe, intente de nuevo");
                            } else {
                                validation = false;
                            }
                        } else {
                            validation = true;
                            System.out.println("Cedula ingresada no valida");
                        }
                        System.out.println("============================================================");
                    }
                } else {
                    System.out.println("Se ha ingresado un caracter no válido");
                }
            } while (validation || tutor2 != null || dniValidation);
            scanner.nextLine();

            String name = "";
            do {
                System.out.println("------------------------------------------------------------");
                System.out.print("Nombres: ");
                name = scanner.nextLine();
                validation = Validation.validationOfCharacter(name);
            } while (!validation);

            String lastName = "";
            do {
                System.out.println("------------------------------------------------------------");
                System.out.print("Apellidos: ");
                lastName = scanner.nextLine();
                validation = Validation.validationOfCharacter(lastName);
            } while (!validation);

            String careerCode = "";
            do {
                System.out.println("------------------------------------------------------------");
                System.out.print("Codigo de Carrera: ");
                careerCode = scanner.next();
                validation = Validation.validationOfCharacter(careerCode);
            } while (validation);

            String email = "";
            do {
                System.out.println("------------------------------------------------------------");
                System.out.print("Email: ");
                email = scanner.next();
                validation = Validation.validationEmail(email);
            } while (!validation);

            String phone = "";
            do {
                System.out.println("------------------------------------------------------------");
                System.out.print("Celular: ");
                phone = scanner.next();
                scanner.nextLine();

                validation = Validation.validationOfCharacter(phone);
                if (phone.length() != 10) {
                    System.out.println("Numero de telefono mal ingresado. Intente de nuevo.");
                }

            } while (phone.length() != 10 || validation);
        }
    }

 
        

    private static Tutor findTutorByDni(String fileName, String dni) {
        List<Tutor> tutors = readTutors(fileName);

        for (Tutor tutor : tutors) {
            if (tutor.getDni().equals(dni)) {
                return tutor;
            }
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("Tutor con cedula: " + dni + " no encontrado.");
        System.out.println("------------------------------------------------------------");
        return null;
    }
    
    
    public static List<Tutor> readTutors(String fileName) {
        List<Tutor> tutors = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                Tutor tutor = new Tutor(
                        values[0],
                        values[1],
                        values[2],
                        values[3],
                        values[4],
                        values[5],
                        values[6]
                );
                tutors.add(tutor);
            }
        } catch (IOException e) {
            System.err.println("Error leyendo el archivo: " + e.getMessage());
        }

        return tutors;
    }

    public void updateTutors(Scanner scanner, String fileName, boolean adminOProfesor) {
        System.out.println("\n============================================================");
        String dni;

        do {
            System.out.print("Introduzca la Cedula del Tutor a Editar: ");
            dni = scanner.next();
            scanner.nextLine();

            boolean validationNumbersDni = Validation.validationOfCharacter(dni);
            if (!validationNumbersDni) {
                if (dni.length() == 10) {
                    if (!Validation.validationDni(dni.length(), dni)) {
                        System.out.println("La cedula ingresada no es valida, intente de nuevo");
                    }
                } else {
                    System.out.println("Cedula ingresada no valida");
                }
                System.out.println("============================================================");
            }
        } while (!Validation.validationDni(dni.length(), dni));

        // Buscar el tutor por su cedula (dni)
        Tutor existingTutor = Tutor.findTutorByDni(fileName, dni);

        if (existingTutor != null && adminOProfesor) {
            System.out.println("Edicion la Informacion del Tutor:");
            System.out.println("------------------------------------------------------------");

            
            System.out.println("Nombre: " + existingTutor.getName());
            System.out.println("Apellido: " + existingTutor.getLastName());
            System.out.println("Codigo de Carrera: " + existingTutor.getCareerCode());
            System.out.println("Email: " + existingTutor.getEmail());
            System.out.println("Celular: " + existingTutor.getPhone());

            
            System.out.println("------------------------------------------------------------");
            System.out.print("Nombre [" + existingTutor.getName() + "]: ");
            String name = scanner.nextLine();
            if (!name.isEmpty()) {
                existingTutor.setName(name);
            }

            System.out.print("Apellido [" + existingTutor.getLastName() + "]: ");
            String lastName = scanner.nextLine();
            if (!lastName.isEmpty()) {
                existingTutor.setLastName(lastName);
            }

            System.out.print("Codigo de Carrera [" + existingTutor.getCareerCode() + "]: ");
            String careerCode = scanner.next();
            scanner.nextLine();
            if (!careerCode.isEmpty()) {
                existingTutor.setCareerCode(careerCode);
            }

            System.out.print("Email [" + existingTutor.getEmail() + "]: ");
            String email = scanner.next();
            scanner.nextLine();
            if (!email.isEmpty()) {
                existingTutor.setEmail(email);
            }

            String phone;
            do {
                System.out.print("Celular [" + existingTutor.getPhone() + "]: ");
                phone = scanner.next();
                scanner.nextLine();
                if (phone.length() != 10) {
                    System.out.println("Numero de telefono mal ingresado. Intente de nuevo.");
                }
            } while (phone.length() != 10);

            existingTutor.setPhone(phone);

            // Guardar los cambios en el archivo
            updateTutorInFile(fileName, existingTutor);
        } else {
            System.out.println("Tutor no encontrado o no tiene permisos para editar.");
        }

        if (existingTutor != null && adminOProfesor) {
            System.out.println("Edicion la Informacion del Tutor:");
            System.out.println("------------------------------------------------------------");

            System.out.print("Nombre [" + existingTutor.getName() + "]: ");
            String name = scanner.nextLine();
            if (!name.isEmpty()) {
                existingTutor.setName(name);
            }
            System.out.println("------------------------------------------------------------");

            System.out.print("Apellido [" + existingTutor.getLastName() + "]: ");
            String lastName = scanner.nextLine();
            if (!lastName.isEmpty()) {
                existingTutor.setLastName(lastName);
            }
            System.out.println("------------------------------------------------------------");

            System.out.print("Codigo de Carrera [" + existingTutor.getCareerCode() + "]: ");
            String careerCode = scanner.next();
            scanner.nextLine();
            if (!careerCode.isEmpty()) {
                existingTutor.setCareerCode(careerCode);
            }
            System.out.println("------------------------------------------------------------");

            System.out.print("Email [" + existingTutor.getEmail() + "]: ");
            String email = scanner.next();
            scanner.nextLine();
            if (!email.isEmpty()) {
                existingTutor.setEmail(email);
            }
            System.out.println("------------------------------------------------------------");

            String phone;
            do {
                System.out.print("Celular [" + existingTutor.getPhone() + "]: ");
                phone = scanner.next();
                scanner.nextLine();
                System.out.println("------------------------------------------------------------");
                if (phone.length() != 10) {
                    System.out.println("Numero de telefono mal ingresado. Intente de nuevo.");
                }
            } while (phone.length() != 10);

            existingTutor.setPhone(phone);

            // Guardar los cambios en el archivo
            updateTutorInFile(fileName, existingTutor);
        } else {
            System.out.println("Tutor no encontrado o no tiene permisos para editar.");
        }
    }

    private void updateTutorInFile(String fileName, Tutor updatedTutor) {
        List<Tutor> tutors = readTutors(fileName);
        boolean found = false;

        for (int i = 0; i < tutors.size(); i++) {
            if (tutors.get(i).getDni().equals(updatedTutor.getDni())) {
                tutors.set(i, updatedTutor);
                found = true;
                break;
            }
        }

        if (found) {
            FileManager.clearFile(fileName);
            for (Tutor tutor : tutors) {
                FileManager.FileSave(tutor.toString(), fileName);
            }
            System.out.println("Tutor actualizado exitosamente.");
        } else {
            System.out.println("Tutor con Cédula " + updatedTutor.getDni() + " no encontrado.");
        }
    }

    public void findTutor(Scanner scanner, String fileName) {
        System.out.println("============================================================");
        System.out.print("Introduzca la cedula del Tutor: ");
        String dni = scanner.next();
        System.out.println("============================================================");

        if (!Validation.validationOfCharacter(dni)) {
            if (dni.length() == 10) {
                if (Validation.validationDni(dni.length(), dni)) {
                    Tutor tutor = Tutor.findTutorByDni(fileName, dni);
                    System.out.println("------------------------------------------------------------");
                    if (tutor != null) {
                        System.out.println("Tutor encontrado:");
                        System.out.println("------------------------------------------------------------");
                        System.out.println("Nombre: " + tutor.getName());
                        System.out.println("Apellido: " + tutor.getLastName());
                        System.out.println("Codigo de Carrera: " + tutor.getCareerCode());
                        System.out.println("Email: " + tutor.getEmail());
                        System.out.println("Celular: " + tutor.getPhone());
                    } else {
                        System.out.println("Tutor con cedula " + dni + " no encontrado.");
                    }
                    System.out.println("------------------------------------------------------------");
                } else {
                    System.out.println("Cedula ingresada no valida.\n");
                }
            } else {
                System.out.println("Cedula debe tener 10 dígitos.");
            }
        } else {
            System.out.println("Se ha ingresado un caracter no valido.");
        }

        pause(scanner);
    }

    public static void pause(Scanner scanner) {
        System.out.print("Pulse Enter para continuar...\n");
        scanner.nextLine();






}
=======
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

    

>>>>>>> fce15ebb908ca647d97dc58e259ff8963e72245b
}
