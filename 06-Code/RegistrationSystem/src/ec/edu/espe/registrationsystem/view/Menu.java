//import ec.edu.espe.registrationsystem.model.Student;
//<<<<<<< HEAD
//
//import java.util.Scanner;
//
//=======
//import utils.Reader;
//import utils.FileManager;
//import utils.Eraser;
//>>>>>>> 8982889438e28483850efc08d07535b7d1f7dfb8
//import utils.Searcher;
//
//import java.nio.charset.StandardCharsets;
//import java.util.List;
//import java.util.Scanner;
//
//public class Menu {
//
//    private static String fileName;
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8.name());
//
//        boolean exit = false;
//
//        while (!exit) {
//
//            System.out.println("Seleccione quién está usando el sistema:");
//            System.out.println("1. Estudiantes");
//            System.out.println("2. Personal administrativo");
//            System.out.println("3. Profesores");
//            System.out.println("4. Salir");
//
//            System.out.print("\nIntroduzca su selección: ");
//            int userType = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (userType) {
//                case 1:
//                    manageStudents(scanner);
//                    break;
//                case 2:
//                    manageAdminStaff(scanner);
//                    break;
//                case 3:
//                    manageProfessors(scanner);
//                    break;
//                case 4:
//                    exit = true;
//                    break;
//                default:
//                    System.out.println("Selección inválida. Por favor, inténtelo de nuevo.");
//                    break;
//            }
//        }
//
//        scanner.close();
//    }
//
//    private static void manageStudents(Scanner scanner) {
//        boolean exit = false;
//
//        while (!exit) {
//            System.out.println("\nSistema para Estudiantes:");
//            System.out.println("1. Encontrar Estudiantes");
//            System.out.println("2. Volver al menú principal");
//
//            System.out.print("\nIntroduzca su selección: ");
//            int operation = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (operation) {
//                case 1:
//                    findStudent(scanner, fileName);
//                    break;
//                case 2:
//                    exit = true;
//                    break;
//                default:
//                    System.out.println("Selección inválida. Por favor, inténtelo de nuevo.");
//                    break;
//            }
//
//            if (!exit) {
//                pause(scanner);
//            }
//        }
//    }
//
//    private static void manageAdminStaff(Scanner scanner) {
//        System.out.print("\nIntroduzca la Carrera: ");
//        fileName = scanner.next();
//        boolean exit = false;
//        
//
//        while (!exit) {
//            System.out.println("\nEscoja una operación:");
//            System.out.println("1. Añadir Estudiante");
//            System.out.println("2. Visualizar Estudiantes");
//            System.out.println("3. Modificar Estudiantes");
//            System.out.println("4. Eliminar Estudiante");
//            System.out.println("5. Encontrar Estudiantes por Cédula");
//            System.out.println("6. Añadir Curso");
//            System.out.println("7. Crear Cuenta de Profesor");
//            System.out.println("8. Salir");
//
//            System.out.print("\nIntroduzca su selección: ");
//            int operation = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (operation) {
//                case 1:
//                    addStudents(scanner, fileName);
//                    break;
//                case 2:
//                    readStudents(fileName);
//                    break;
//                case 3:
//                    updateStudent(scanner, fileName);
//                    break;
//                case 4:
//                    deleteStudent(scanner, fileName);
//                    break;
//                case 5:
//                    findStudent(scanner, fileName);
//                    break;
//                case 6:
//                    addCourse(scanner, fileName);
//                    break;  
//                case 7:
//                    addTutorAccount (scanner, fileName);
//                    break;    
//                case 8:
//                    exit = true;
//                    break;
//                default:
//                    System.out.println("Selección inválida. Por favor, inténtelo de nuevo.");
//                    break;
//            }
//        }
//    }
//
//    private static void addStudents(Scanner scanner, String fileName) {
//        System.out.print("\nCuántos estudiantes quiere agregar?: ");
//        int studentNumber = scanner.nextInt();
//        scanner.nextLine();
//
//        for (int aux = 0; aux < studentNumber; aux++) {
//            System.out.println("\nInformación del Estudiante Nuevo");
//
//            System.out.print("Cédula: ");
//            String dni = scanner.next();
//
//            System.out.print("Nombres: ");
//            String name = scanner.next();
//
//            System.out.print("Apellidos: ");
//            String lastName = scanner.next();
//
//            System.out.print("Código de Carrera: ");
//            String careerCode = scanner.next();
//
//            System.out.print("Email: ");
//            String email = scanner.next();
//
//            System.out.print("Celular: ");
//            String phone = scanner.next();
//            
//            System.out.print("Tipo de Matricula: ");
//            String typeOfRegistration = scanner.next();
//            
//            System.out.print("Calificacion: ");
//            String grade = scanner.next();
//            
//            System.out.print("Supletorio: ");
//            String lastChance = scanner.next();
//
//            Student student = new Student(dni, name, lastName, careerCode, email, phone, typeOfRegistration, grade, lastChance);
//            FileManager.FileSave(student.toString(), fileName);
//        }
//    }
//
//    private static void readStudents(String fileName) {
//        List<Student> students = Reader.readStudents(fileName);
//        System.out.println("\nLista de Estudiantes:");
//        for (Student student : students) {
//            System.out.println(student);
//        }
//    }
//
//    private static void updateStudent(Scanner scanner, String fileName) {
//        System.out.print("\nIntroduzca la Cédula del Estudiante a Editar: ");
//        String dni = scanner.next();
//        scanner.nextLine();
//        Student existingStudent = Searcher.findStudentByDNI(fileName, dni);
//
//        if (existingStudent != null) {
//            System.out.println("\nEditar la Información del Estudiante");
//
//            System.out.print("Nombres [" + existingStudent.getName() + "]: ");
//            String name = scanner.next();
//            scanner.nextLine();
//
//            System.out.print("Apellidos [" + existingStudent.getLastName() + "]: ");
//            String lastName = scanner.next();
//            scanner.nextLine();
//
//            System.out.print("Código de Carrera [" + existingStudent.getCareerCode() + "]: ");
//            String careerCode = scanner.next();
//            scanner.nextLine();
//
//            System.out.print("Email [" + existingStudent.getEmail() + "]: ");
//            String email = scanner.next();
//            scanner.nextLine();
//
//            System.out.print("Celular [" + existingStudent.getPhone() + "]: ");
//            String phone = scanner.next();
//            scanner.nextLine();
//            
//            System.out.print("Tipo de matricula [" + existingStudent.getTypeOfRegistration()+ "]: ");
//            String typeOfRegistration = scanner.next();
//            scanner.nextLine();
//            
//            System.out.print("Calificacion [" + existingStudent.getGrade() + "]: ");
//            String grade = scanner.next();
//            scanner.nextLine();
//            
//            System.out.print("Supletorio [" + existingStudent.getLastName() + "]: ");
//            String lastChance = scanner.next();
//            scanner.nextLine();
//
//            Student updatedStudent = new Student(dni, name, lastName, careerCode, email, phone, typeOfRegistration, grade, lastChance);
//            Updater.updateStudent(fileName, updatedStudent);
//        } else {
//            System.out.println("Estudiante con Cédula: " + dni + " no encontrado.");
//        }
//    }
//
//    private static void deleteStudent(Scanner scanner, String fileName) {
//        System.out.print("\nIntroduzca la Cédula del Estudiante a Eliminar: ");
//        String dni = scanner.next();
//        scanner.nextLine();
//        Eraser.deleteStudent(fileName, dni);
//    }
//
//    private static void findStudent(Scanner scanner, String fileName) {
//        System.out.print("\nIntroduzca la Cédula del Estudiante a Buscar: ");
//        String dni = scanner.next();
//        scanner.nextLine();
//        Student student = Searcher.findStudentByDNI(fileName, dni);
//        if (student != null) {
//            System.out.println("Estudiante encontrado: " + student);
//        } else {
//            System.out.println("Estudiante con Cédula " + dni + " No Encontrado.");
//        }
//    }
//
//    private static void pause(Scanner scanner) {
//        System.out.print("\nPulse Enter para continuar...");
//        scanner.nextLine();
//    }
//
//=======
//package ec.edu.espe.registrationsystem.view;
//
//import ec.edu.espe.registrationsystem.model.Student;
//import utils.Reader;
//import utils.FileManager;
//import utils.Eraser;
//import utils.Searcher;
//import utils.Updater;
//import java.nio.charset.StandardCharsets;
//import java.util.List;
//import java.util.Scanner;
//
//public class Menu {
//
//    private static String fileName;
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8.name());
//        
//        boolean exit = false;
//
//        while (!exit) {
//
//            System.out.println("Seleccione quién está usando el sistema:");
//            System.out.println("1. Estudiantes");
//            System.out.println("2. Personal administrativo");
//            System.out.println("3. Profesores");
//            System.out.println("4. Salir");
//
//            System.out.print("\nIntroduzca su selección: ");
//            int userType = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (userType) {
//                case 1 -> manageStudents(scanner);
//                case 2 -> manageAdminStaff(scanner);
////                /*case 3 -> manageProfessors(scanner);*/
//                case 4 -> exit = true;
//                default -> System.out.println("Selección inválida. Por favor, inténtelo de nuevo.");
//            }
//        }
//
//        scanner.close();
//    }
//
//    private static void manageStudents(Scanner scanner) {
//        boolean exit = false;
//
//        while (!exit) {
//            System.out.println("\nSistema para Estudiantes:");
//            System.out.println("1. Encontrar Estudiantes");
//            System.out.println("2. Volver al menú principal");
//            
//            System.out.print("\nIntroduzca su selección: ");
//            int operation = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (operation) {
//                case 1 -> findStudent(scanner, fileName);
//                case 2 -> exit = true;
//                default -> System.out.println("Selección inválida. Por favor, inténtelo de nuevo.");
//            }
//
//            if (!exit) {
//                pause(scanner);
//            }
//        }
//    }
//
//    private static void manageAdminStaff(Scanner scanner) {
//        System.out.print("\nIntroduzca el Curso: ");
//        fileName = scanner.next();
//        
//        
//        boolean exit = false;
//        while (!exit) {
//            System.out.println("\nEscoja una operación:");
//            System.out.println("1. Añadir Estudiante");
//            System.out.println("2. Visualizar Estudiantes");
//            System.out.println("3. Modificar Estudiantes");
//            System.out.println("4. Eliminar Estudiante");
//            System.out.println("5. Encontrar Estudiantes por Cédula");
//            System.out.println("6. Añadir Tutor");
//            System.out.println("7. Salir");
//
//            System.out.print("\nIntroduzca su selección: ");
//            int operation = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (operation) {
//                case 1 -> addStudents(scanner, fileName);
//                case 2 -> readStudents(fileName);
//                case 3 -> updateStudent(scanner, fileName);
//                case 4 -> deleteStudent(scanner, fileName);
//                case 5 -> findStudent(scanner, fileName);
//                case 6 -> findStudent(scanner, fileName);
//                case 7 -> exit = true;
//                default -> System.out.println("Selección inválida. Por favor, inténtelo de nuevo.");
//            }
//        }
//    }
//
//    private static void addStudents(Scanner scanner, String fileName) {
//        System.out.print("\nCuántos estudiantes quiere agregar?: ");
//        int studentNumber = scanner.nextInt();
//        scanner.nextLine();
//        
//        for (int aux = 0; aux < studentNumber; aux++) {
//            System.out.println("\nInformación del Estudiante Nuevo");
//
//            System.out.print("Cédula: ");
//            String dni = scanner.next();
//
//            System.out.print("Nombres: ");
//            String name = scanner.next();
//
//            System.out.print("Apellidos: ");
//            String lastName = scanner.next();
//
//            System.out.print("Código de Carrera: ");
//            String careerCode = scanner.next();
//
//            System.out.print("Email: ");
//            String email = scanner.next();
//
//            System.out.print("Celular: ");
//            String phone = scanner.next();
//            
//            System.out.print("Tipo de Matricula: ");
//            String typeOfRegistration = scanner.next();
//            
//            System.out.print("Calificacion: ");
//            String grade = scanner.next();
//            
//            System.out.print("Supletorio: ");
//            String lastChance = scanner.next();
//
//            Student student = new Student(dni, name, lastName, careerCode, email, phone, typeOfRegistration, grade, lastChance);
//            FileManager.FileSave(student.toString(), fileName);
//        }
//    }
//
//    private static void readStudents(String fileName) {
//        List<Student> students = Reader.readStudents(fileName);
//        System.out.println("\nLista de Estudiantes:");
//        for (Student student : students) {
//            System.out.println(student);
//        }
//    }
//
//    private static void updateStudent(Scanner scanner, String fileName) {
//        System.out.print("\nIntroduzca la Cédula del Estudiante a Editar: ");
//        String dni = scanner.next();
//        scanner.nextLine();
//        Student existingStudent = Searcher.findStudentByDNI(fileName, dni);
//
//        if (existingStudent != null) {
//            System.out.println("\nEditar la Información del Estudiante");
//
//            System.out.print("Nombres [" + existingStudent.getName() + "]: ");
//            String name = scanner.next();
//            scanner.nextLine();
//
//            System.out.print("Apellidos [" + existingStudent.getLastName() + "]: ");
//            String lastName = scanner.next();
//            scanner.nextLine();
//
//            System.out.print("Código de Carrera [" + existingStudent.getCareerCode() + "]: ");
//            String careerCode = scanner.next();
//            scanner.nextLine();
//
//            System.out.print("Email [" + existingStudent.getEmail() + "]: ");
//            String email = scanner.next();
//            scanner.nextLine();
//
//            System.out.print("Celular [" + existingStudent.getPhone() + "]: ");
//            String phone = scanner.next();
//            scanner.nextLine();
//            
//            System.out.print("Tipo de matricula [" + existingStudent.getTypeOfRegistration()+ "]: ");
//            String typeOfRegistration = scanner.next();
//            scanner.nextLine();
//            
//            System.out.print("Calificacion [" + existingStudent.getGrade() + "]: ");
//            String grade = scanner.next();
//            scanner.nextLine();
//            
//            System.out.print("Supletorio [" + existingStudent.getLastName() + "]: ");
//            String lastChance = scanner.next();
//            scanner.nextLine();
//
//            Student updatedStudent = new Student(dni, name, lastName, careerCode, email, phone, typeOfRegistration, grade, lastChance);
//            Updater.updateStudent(fileName, updatedStudent);
//        } else {
//            System.out.println("Estudiante con Cédula: " + dni + " no encontrado.");
//        }
//    }
//
//    private static void deleteStudent(Scanner scanner, String fileName) {
//        System.out.print("\nIntroduzca la Cédula del Estudiante a Eliminar: ");
//        String dni = scanner.next();
//        scanner.nextLine();
//        Eraser.deleteStudent(fileName, dni);
//    }
//
//    private static void findStudent(Scanner scanner, String fileName) {
//        System.out.print("\nIntroduzca la Cédula del Estudiante a Buscar: ");
//        String dni = scanner.next();
//        scanner.nextLine();
//        Student student = Searcher.findStudentByDNI(fileName, dni);
//        if (student != null) {
//            System.out.println("Estudiante encontrado: " + student);
//        } else {
//            System.out.println("Estudiante con Cédula " + dni + " No Encontrado.");
//        }
//    }
//
//    
//
//>>>>>>> 432eb2e81dc8acc09dfdbcb55b33799700288d99
////    private static void manageProfessors(Scanner scanner) {
////        // Implementar gestión de profesores aquí
////        System.out.println("Funcionalidad para Profesores no implementada.");
////    }
//<<<<<<< HEAD
////}
//=======
//
//    private static void pause(Scanner scanner) {
//        System.out.print("\nPulse Enter para continuar...");
//        scanner.nextLine();
//    }
//}
//
//>>>>>>> 432eb2e81dc8acc09dfdbcb55b33799700288d99
