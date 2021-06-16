package password_complexity;

import java.util.Scanner;

public class PasswordComplexity {
    /*
     * must have at least 6 characters
     * must have one uppercase letter
     * must have one lowercase letter
     * must have one number
     * -------------------------------
     * String as input
     * Boolean as output
     * */

    public static boolean isPasswordComplex(String password) {
        int pasLength = password.length();
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int numberCount = 0;
        if (password.length() < 6) {
            return false;
        } else {
            for (int i = 0; i < pasLength; i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    upperCaseCount++;
                }
                if (Character.isLowerCase(password.charAt(i))) {
                    lowerCaseCount++;
                }
                if (password.matches(".*\\d.*")) {
                    numberCount++;
                }
            }
        }
        if (upperCaseCount > 0 && lowerCaseCount > 0 && numberCount > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("add password to check its complexity");
        String password = sc.next();
        System.out.println("Is password complex : " + isPasswordComplex(password));
    }

}
