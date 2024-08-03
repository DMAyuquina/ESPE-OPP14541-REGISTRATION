package ec.edu.espe.registersystemmaven.model;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class Grade {
    
    private float unitOne;
    private float unitTwo;
    private float finalGrade;
    private float lastChance;

    public Grade(float unitOne, float unitTwo, float finalGrade, float lastChance) {
        this.unitOne = unitOne;
        this.unitTwo = unitTwo;
        this.finalGrade = finalGrade;
        this.lastChance = lastChance;
    }

    public Grade() {
    }
    

    /**
     * @return the unitOne
     */
    public float getUnitOne() {
        return unitOne;
    }

    /**
     * @param unitOne the unitOne to set
     */
    public void setUnitOne(float unitOne) {
        this.unitOne = unitOne;
    }

    /**
     * @return the unitTwo
     */
    public float getUnitTwo() {
        return unitTwo;
    }

    /**
     * @param unitTwo the unitTwo to set
     */
    public void setUnitTwo(float unitTwo) {
        this.unitTwo = unitTwo;
    }

    /**
     * @return the finalGrade
     */
    public float getFinalGrade() {
        return finalGrade;
    }

    /**
     * @param finalGrade the finalGrade to set
     */
    public void setFinalGrade(float finalGrade) {
        this.finalGrade = finalGrade;
    }

    /**
     * @return the lastChance
     */
    public float getLastChance() {
        return lastChance;
    }

    /**
     * @param lastChance the lastChance to set
     */
    public void setLastChance(float lastChance) {
        this.lastChance = lastChance;
    }
    
}
