package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        assert number > 0;

        int tempNumber = number;
        int reversedNumber = 0;

        while(tempNumber != 0) {
            int digit = tempNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            tempNumber /= 10;
        }

        boolean palindrome = number == reversedNumber;

        System.out.println("Palindrome: " + palindrome);
    }
}
