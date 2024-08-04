package utils;

import java.util.Base64;

/*
 * @author LogicLegion, DCCO-ESPE 
 *
 */
public class PasswordEncryption {

 // Encripta la contraseña cambiando cada carácter por el siguiente en el abecedario
    public static String encrypt(String password) {
        StringBuilder encryptedPassword = new StringBuilder();
        for (char ch : password.toCharArray()) {
            switch (ch) {
                case 'z':
                    encryptedPassword.append('a');
                    break;
                case 'Z':
                    encryptedPassword.append('A');
                    break;
                default:
                    encryptedPassword.append((char) (ch + 1));
                    break;
            }
        }
        return encryptedPassword.toString();
    }

    // Desencripta la contraseña cambiando cada carácter por el anterior en el abecedario
    public static String decrypt(String encryptedPassword) {
        StringBuilder decryptedPassword = new StringBuilder();
        for (char ch : encryptedPassword.toCharArray()) {
            switch (ch) {
                case 'a':
                    decryptedPassword.append('z');
                    break;
                case 'A':
                    decryptedPassword.append('Z');
                    break;
                default:
                    decryptedPassword.append((char) (ch - 1));
                    break;
            }
        }
        return decryptedPassword.toString();
    }
}