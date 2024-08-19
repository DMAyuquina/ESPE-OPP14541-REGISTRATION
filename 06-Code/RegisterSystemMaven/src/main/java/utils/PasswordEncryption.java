package utils;

import java.util.Base64;

/*
 * @author LogicLegion, DCCO-ESPE 
 *
 */
public class PasswordEncryption {


    public static String encrypt(String password) {
        StringBuilder encryptedPassword = new StringBuilder();
        for (char ch : password.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (ch == 'z') {
                    encryptedPassword.append('a');
                } else if (ch == 'Z') {
                    encryptedPassword.append('A');
                } else {
                    encryptedPassword.append((char) (ch + 1));
                }
            } else {
                encryptedPassword.append(ch); // Mantener caracteres no alfabéticos sin cambiar
            }
        }
        return encryptedPassword.toString();
    }

    
    public static String decrypt(String encryptedPassword) {
        StringBuilder decryptedPassword = new StringBuilder();
        for (char ch : encryptedPassword.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (ch == 'a') {
                    decryptedPassword.append('z');
                } else if (ch == 'A') {
                    decryptedPassword.append('Z');
                } else {
                    decryptedPassword.append((char) (ch - 1));
                }
            } else {
                decryptedPassword.append(ch); // Mantener caracteres no alfabéticos sin cambiar
            }
        }
        return decryptedPassword.toString();
    }
}