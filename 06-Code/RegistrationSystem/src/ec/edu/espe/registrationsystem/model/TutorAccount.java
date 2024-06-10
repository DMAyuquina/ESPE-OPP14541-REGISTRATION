package ec.edu.espe.registrationsystem.model;

/**
 *
 * @author Logic Legion, DCCO-ESPE
 */
public class TutorAccount {

    private String tutorUser;
    private String tutorPasword;
    private StudentGrade studentGrade[];

    @Override
    public String toString() {
        String localStudentGrade = "";
        for(int i=0; i<studentGrade.length; i++){
            localStudentGrade = localStudentGrade + studentGrade[i];
        }
        return "TutorAccount{" + "tutorUser=" + tutorUser + ", tutorPasword=" + tutorPasword + ", studentGrade=" + localStudentGrade + '}';
    }

    
    public TutorAccount(String tutorUser, String tutorPasword, StudentGrade[] studentGrade) {
        this.tutorUser = tutorUser;
        this.tutorPasword = tutorPasword;
        this.studentGrade = new StudentGrade[studentGrade.length];
    }

    public void viewCourse(){

    }
    
    public void adddStudentGrade(){

    }
    /**
     * @return the tutorUser
     */
    public String getTutorUser() {
        return tutorUser;
    }

    /**
     * @param tutorUser the tutorUser to set
     */
    public void setTutorUser(String tutorUser) {
        this.tutorUser = tutorUser;
    }

    /**
     * @return the tutorPasword
     */
    public String getTutorPasword() {
        return tutorPasword;
    }

    /**
     * @param tutorPasword the tutorPasword to set
     */
    public void setTutorPasword(String tutorPasword) {
        this.tutorPasword = tutorPasword;
    }

    /**
     * @return the studentGrade
     */
    public StudentGrade[] getStudentGrade() {
        return studentGrade;
    }

    /**
     * @param studentGrade the studentGrade to set
     */
    public void setStudentGrade(StudentGrade[] studentGrade) {
        this.studentGrade = studentGrade;
    }
}
