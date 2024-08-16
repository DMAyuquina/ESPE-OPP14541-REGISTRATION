package Utils;

import java.util.Base64;

/*
 * @author LogicLegion, DCCO-ESPE 
 *
 */
public class PasswordEncryption {


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