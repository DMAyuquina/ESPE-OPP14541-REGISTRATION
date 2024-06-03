/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.registrationsystem.model;

/**
 *
 * @author Enzo Armijos , Logic Legion DCCO-ESPE
 */
public class Course {
    private String codeCourse;

    public Course(String codeCourse) {
        this.codeCourse = codeCourse;
    }

    public String getCodeCourse() {
        return codeCourse;
    }

    public void setCodeCourse(String codeCourse) {
        this.codeCourse = codeCourse;
    }

  
    @Override
    public String toString() {
        return super.toString(); 
    }

}
