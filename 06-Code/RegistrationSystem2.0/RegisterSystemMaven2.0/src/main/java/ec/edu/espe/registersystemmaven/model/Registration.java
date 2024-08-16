package ec.edu.espe.registersystemmaven.model;

import ec.edu.espe.registersystemmaven.controller.RegistrationManager;

/**
 *
 * @author LogicLegion, DCCO-ESPE
 */
public class Registration {
    
    private String period;
    private String typeOfRegistration;
    private String gratuity;

    public Registration(String period, String typeOfRegistration) {
        this.period = period;
        this.typeOfRegistration = typeOfRegistration;
        this.gratuity = RegistrationManager.determinateGratuity(typeOfRegistration);
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
        return RegistrationManager.determinateGratuity(typeOfRegistration);
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
