package ec.edu.espe.registrationsystem.model;

/**
 *
 * @author Logic Legion DCCO-ESPE
 */
public class Course {
    private String codeCourse;
    private Student students[];
    private Tutor tutor;

    @Override
    public String toString() {
        String localStudents = "";
        for(int i=0; i<getStudents().length; i++){
            localStudents = localStudents + getStudents()[i];
        }
        return "Course{" + "codeCourse=" + getCodeCourse()+ "tutor=" + getTutor() + ", students=" + localStudents + '}';
    }

    public Course(String codeCourse, Student[] students, Tutor tutor) {
        this.codeCourse = codeCourse;
        this.students = new Student[students.length];
        this.tutor = tutor;
    }

   
    /**
     * @return the codeCourse
     */
    public String getCodeCourse() {
        return codeCourse;
    }

    /**
     * @param codeCourse the codeCourse to set
     */
    public void setCodeCourse(String codeCourse) {
        this.codeCourse = codeCourse;
    }

    /**
     * @return the students
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     * @return the tutor
     */
    public Tutor getTutor() {
        return tutor;
    }

    /**
     * @param tutor the tutor to set
     */
    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

}
