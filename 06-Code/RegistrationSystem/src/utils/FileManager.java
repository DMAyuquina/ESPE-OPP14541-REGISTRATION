package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Logic Legion, DCCO-ESPE
 */
    
public class FileManager {

    public static void FileSave(String data, String fileName) {
        fileName = fileName + ".csv";

        try (FileWriter fileWriter = new FileWriter(fileName, true); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(data);
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.err.println("Error escribiendo al archivo: " + e.getMessage());
        }
    }

    public static void clearFile(String fileName) {
        fileName = fileName + ".csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("");
        } catch (IOException e) {
            System.err.println("Error clearing the file: " + e.getMessage());
        }
    }

    public static int FileReadLastId(String fileName) {
        String lastLine = "";
        fileName = fileName + ".csv";
        String separator = ",";

        try (BufferedReader read = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = read.readLine()) != null) {
                lastLine = line;
            }
            if (lastLine != null) {
                String[] values = lastLine.split(separator);
                try {
                    return Integer.parseInt(values[0]);
                } catch (NumberFormatException e) {
                    System.out.println("Error reading last data");
                    return 0;
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        return 0;
    }
}