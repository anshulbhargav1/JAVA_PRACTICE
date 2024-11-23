package anshul;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int originalNum = n;
        int reversedNum = 0;

        // Logic to reverse the number
        while (n != 0) {
            int lastDigit = n % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            n = n / 10;
        }

        // Check if the original number is equal to the reversed number
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } 
        else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}
