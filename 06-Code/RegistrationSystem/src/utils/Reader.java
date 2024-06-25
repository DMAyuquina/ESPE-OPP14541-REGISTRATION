package utils;

import ec.edu.espe.registrationsystem.model.Student;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Logic Legion, DCCO-ESPE
 */

public class Reader {

    public static List<Student> readStudents(String fileName) {
        List<Student> students = new ArrayList<>();

        fileName = fileName + ".csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
             while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                Student student = new Student(
                        values[0],
                        values[1],
                        values[2],
                        values[3],
                        values[4],
                        values[5],
                        values[6],
                        values[7],
                        values[8],
                        values[9]
            
           
                );
                students.add(student);
            }
        } catch (IOException e) {
            System.err.println("Error leyendo el archivo: " + e.getMessage());
        }

        return students;

    }

    public static List<Student> readTutors(String fileName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void m(){
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
