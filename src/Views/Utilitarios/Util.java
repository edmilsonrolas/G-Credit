/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views.Utilitarios;

/**
 *
 * @author Matavele's
 */
public class Util {

    public static int verifPassword(String password) {
        int score = 0;
        if (password.length() >= 8) {
            score++;
        }
        boolean hasUpperCase = !password.equals(password.toLowerCase());
        if (hasUpperCase) {
            score++;
        }
        boolean hasLowerCase = !password.equals(password.toUpperCase());
        if (hasLowerCase) {
            score++;
        }
        boolean hasDigit = password.matches(".*\\d.*");
        if (hasDigit) {
            score++;
        }
        boolean hasSpecialChar = !password.matches("[A-Za-z0-9]*");
        if (hasSpecialChar) {
            score++;
        }
        if (score < 3) {
            return 1;
        } else if (score < 5) {
            return 2;

        } else {
            return 3;
        }
    }
}
