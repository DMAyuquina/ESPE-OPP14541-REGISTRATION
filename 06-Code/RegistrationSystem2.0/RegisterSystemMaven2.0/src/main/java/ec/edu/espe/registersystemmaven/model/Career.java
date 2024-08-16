package ec.edu.espe.registersystemmaven.model;

/**
 *
 * @author LogicLegion, DCCO-ESPE
 */
public class Career {

    private String careerName;
    private String careerCode;

    public Career() {
    }

    public Career(String careerName, String careerCode) {
        this.careerName = careerName;
        this.careerCode = careerCode;
    }

    /**
     * @return the careerName
     */
    public String getCareerName() {
        return careerName;
    }

    /**
     * @param careerName the careerName to set
     */
    public void setCareerName(String careerName) {
        this.careerName = careerName;
    }

    /**
     * @return the careerCode
     */
    public String getCareerCode() {
        return careerCode;
    }

    /**
     * @param careerCode the careerCode to set
     */
    public void setCareerCode(String careerCode) {
        this.careerCode = careerCode;
    }

}
