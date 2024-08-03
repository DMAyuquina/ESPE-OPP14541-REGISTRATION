package ec.edu.espe.registersystemmaven.model;

import java.util.ArrayList;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class Course {
    
    private String courseCode;
    private String courseName;
    private ArrayList<Tutor> tutors;

    public Course(String courseCode, String courseName, ArrayList<Tutor> tutors) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.tutors = tutors;
    }

    /**
     * @return the courseCode
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * @param courseCode the courseCode to set
     */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * @return the tutors
     */
    public ArrayList<Tutor> getTutors() {
        return tutors;
    }

    /**
     * @param tutors the tutors to set
     */
    public void setTutors(ArrayList<Tutor> tutors) {
        this.tutors = tutors;
    }
    
}
