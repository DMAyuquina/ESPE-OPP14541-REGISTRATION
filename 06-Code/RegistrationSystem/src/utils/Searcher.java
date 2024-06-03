package utils;

import ec.edu.espe.registrationsystem.model.Student;
import java.util.List;

/**
 *
 * @author Logic Legion, DCCO-ESPE
 */

public class Searcher {

    public static Student findStudentByDNI(String fileName, String dni) {
        List<Student> students = Reader.readStudents(fileName);
        
        for (Student student : students) {
            if (student.getDni().equals(dni)) {
                return student;
            }
        }
        
        System.out.println("Student with DNI " + dni + " not found.");
        return null;
    }
}
