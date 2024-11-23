package anshul;

import java.util.Scanner;

public class SumTillPressZeo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        int temp = 0;

        // Keep looping until the user enters 0
        while (true) {
            System.out.println("Enter a number (0 to stop): ");
            n = input.nextInt(); // Take integer input from the user

            // Break the loop if user enters 0
            if (n == 0) {
                break;
            }
            if(n > temp){
                temp = n;

            }




        }
        System.out.println(temp);


    }
}
