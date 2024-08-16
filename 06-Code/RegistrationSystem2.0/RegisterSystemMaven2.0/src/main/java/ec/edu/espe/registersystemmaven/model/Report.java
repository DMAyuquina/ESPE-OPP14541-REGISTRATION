/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.registersystemmaven.model;

import java.util.Date;

/**
 *
 * @author LogicLegion, DCCO-ESPE
 */
public class Report {
    
    private final String INSTITUTE="INSTITUTO SUPERIOR SIMÓN BOLIVAR";
    private Date date;
    private String name;
    private String period;
    private String description;

    public Report(Date date, String name, String period, String description) {
        this.date = date;
        this.name = name;
        this.period = period;
        this.description = description;
    }

    /**
     * @return the institute
     */
    public String getInstitute() {
        return INSTITUTE;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
}
