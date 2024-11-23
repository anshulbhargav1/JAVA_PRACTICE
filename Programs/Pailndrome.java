package anshul;

import java.util.Scanner;

public class Pailndrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the string: ");
        String orignalString = input.nextLine();
        // To improve performance, you can use StringBuilder,
        // which is mutable and allows for efficient string concatenation.
        StringBuilder reversedString = new StringBuilder();
        int length = orignalString.length();

        for(int i = length -1; i >= 0; i--){
            reversedString.append(orignalString.charAt(i));
        }
        // convert StringBuilder into string for comparsion.
        if(orignalString.equals(reversedString.toString())) {
            System.out.println("this is palindrome ");
        }
        else{
            System.out.println("this is not palindrome ");
        }
    }
}
