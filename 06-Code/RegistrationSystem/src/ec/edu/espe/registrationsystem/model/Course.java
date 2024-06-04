package ec.edu.espe.registrationsystem.model;

/**
 *
 * @author Logic Legion DCCO-ESPE
 */
public class Course {
    private String codeCourse;

    public Course(String codeCourse) {
        this.codeCourse = codeCourse;
    }

    public String getCodeCourse() {
        return codeCourse;
    }

    public void setCodeCourse(String codeCourse) {
        this.codeCourse = codeCourse;
    }

  
    @Override
    public String toString() {
        return super.toString(); 
    }

}
