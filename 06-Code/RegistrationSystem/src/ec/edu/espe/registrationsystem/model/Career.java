package ec.edu.espe.registrationsystem.model;

/**
 *
 * @author Logic Legion DCCO-ESPE
 */
public class Career {
    private String careers;

    public Career(String careers) {
        this.careers = careers;
    }

    public String getCareers() {
        return careers;
    }

    public void setCareers(String careers) {
        this.careers = careers;
    }

    @Override
    public String toString() {
        return super.toString(); 
    }
    
}
