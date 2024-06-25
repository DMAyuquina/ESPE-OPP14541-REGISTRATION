package ec.edu.espe.registrationsystem.model;

import java.util.ArrayList;
import utils.Reader;

/**
 *
 * @author Logic Legion DCCO-ESPE
 */
public class Course {

    private String courses;
    private ArrayList<Student> students = Reader.readStudents(courses);
    private Tutor tutor;
    
    public static void readCourse(){
        
    }
}
