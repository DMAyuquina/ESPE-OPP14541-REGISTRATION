package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validation {

    public static int validationOfInt(int number, Scanner scanner) {
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Se ha ingresado un caracter no valido");
            return 0;
        }
        scanner.nextLine();
        return number;
    }

    public static float validationOfFloat(float grade, Scanner scanner) {
        try {
            grade = scanner.nextFloat();
        } catch (InputMismatchException e) {
            grade = -1.0F;
            System.out.println("Se ha ingresado un valor no valido.");
        }
        scanner.nextLine();
        return grade;
    }

    public static boolean validationOfCharacter(String phrase) {
        for (int i = 0; i < phrase.length(); i++) {
            if (!Character.isLetter(phrase.charAt(i)) && phrase.charAt(i) != ' ') {
                return false;
            }
        }
        return true;
    }

    public static boolean validationEmail(String email) {
        return email.contains("@");
    }

    public static boolean validationDni(int length, String dni) {
        if (length == 10) {
            int digOdd = 0, digPair = 0, addOdds = 0, addPairs = 0, comp, comp2;
            String dig1, dig2;

            for (int j = 0; j < length - 1; j++) {
                if ((j + 1) % 2 != 0) {
                    dig1 = Character.toString(dni.charAt(j));
                    digOdd = 2 * Integer.parseInt(dig1);
                    if (digOdd > 9) {
                        digOdd = digOdd - 9;
                    }
                    addOdds += digOdd;
                } else {
                    dig2 = Character.toString(dni.charAt(j));
                    digPair = Integer.parseInt(dig2);
                    addPairs += digPair;
                }
            }

            dig1 = Character.toString(dni.charAt(9));
            digPair = Integer.parseInt(dig1);
            comp = (addOdds + addPairs) % 10;
            comp2 = 10 - comp;

            return comp == 0 ? comp == digPair : comp2 == digPair;
        }
        return false;
    }

    public static boolean validationPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("0\\d{9}");
    }

    public static boolean validationGrade(String grade) {
        try {
            float value = Float.parseFloat(grade);
            return value >= 0 && value <= 10;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
