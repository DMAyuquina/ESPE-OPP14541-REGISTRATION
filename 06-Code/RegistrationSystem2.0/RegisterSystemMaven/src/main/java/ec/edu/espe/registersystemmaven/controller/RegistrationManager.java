package ec.edu.espe.registersystemmaven.controller;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class RegistrationManager {
    public boolean determinateGratuity(){
        
        return false;
    }
    
    public boolean determinatePromoteByAssistence(float assistence){
        
        if(assistence <=0.8){
            return false;
        }
        
        return true;
    }
    
    public boolean determinatePromoteByFinalGrade(float finalGrade){
        
        if(finalGrade<7){
            return true;
        }
        
        return false;
    }
    
}
