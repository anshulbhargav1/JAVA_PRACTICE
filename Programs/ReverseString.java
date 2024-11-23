package anshul;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Use nextLine() to allow full sentence inputs with spaces
        System.out.print("Enter a string to reverse: ");
        String str = input.nextLine();

        // Reversing the string using a loop
        System.out.print("Reversed String: ");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));  // Print each character in reverse order
        }
    }
}
