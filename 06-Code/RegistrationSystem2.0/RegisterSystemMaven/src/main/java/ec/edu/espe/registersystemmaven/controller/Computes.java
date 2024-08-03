/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.registersystemmaven.controller;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author  LogicLegion, DCCO-ESPE
 */
public class Computes {

    public static int computeAgeInYears(LocalDate bornOnDate) {  // "YYYY-DD-MM"
        LocalDate today = LocalDate.now();
        int numberOfYears = Period.between(bornOnDate, today).getYears();
        return numberOfYears;
    }
}
