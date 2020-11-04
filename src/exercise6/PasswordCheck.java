package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean validPass = false;

        do {
            String pass = input.nextLine();
            int digits = 0;

            if (pass.length() >= 8) {
                for(int i = 0; i < pass.length(); i++) {
                    if (Character.isLetterOrDigit(pass.charAt(i))) {
                        if (Character.isDigit(pass.charAt(i))) {
                            digits++;
                        }
                    } else {
                        break;
                    }
                }

                if (digits >= 2) {
                    validPass = true;
                }
            }
        } while (validPass == false);

        System.out.println("Password valid!");
    }
}
