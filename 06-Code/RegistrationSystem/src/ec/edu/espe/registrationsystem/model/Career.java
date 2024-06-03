/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.registrationsystem.model;

/**
 *
 * @author Enzo Armijos , Logic Legion DCCO-ESPE
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
