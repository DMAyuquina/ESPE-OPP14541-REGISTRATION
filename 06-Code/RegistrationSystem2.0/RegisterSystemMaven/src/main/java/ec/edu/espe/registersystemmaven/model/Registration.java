package ec.edu.espe.registersystemmaven.model;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class Registration {
    
    private String period;
    private String typeOfRegistration;
    private String gratuity;

    public Registration(String period, String typeOfRegistration, String gratuity) {
        this.period = period;
        this.typeOfRegistration = typeOfRegistration;
        this.gratuity = gratuity;
    }

    public Registration() {
    }

    /**
     * @return the period
     */
    public String getPeriod() {
        return period;
    }

    /**
     * @param period the period to set
     */
    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * @return the typeOfRegistration
     */
    public String getTypeOfRegistration() {
        return typeOfRegistration;
    }

    /**
     * @param typeOfRegistration the typeOfRegistration to set
     */
    public void setTypeOfRegistration(String typeOfRegistration) {
        this.typeOfRegistration = typeOfRegistration;
    }

    /**
     * @return the gratuity
     */
    public String getGratuity() {
        return gratuity;
    }

    /**
     * @param gratuity the gratuity to set
     */
    public void setGratuity(String gratuity) {
        this.gratuity = gratuity;
    }

    public void getRegistration(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
