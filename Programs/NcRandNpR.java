package anshul;

import java.util.Scanner;

public class NcRandNpR {

    // Method to calculate factorial
    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input for n and r
        System.out.print("Enter the n (Total no. of things): ");
        int n = input.nextInt();
        System.out.print("Enter the r (No. of things chosen from n): ");
        int r = input.nextInt();

        // Check if n >= r
        if (n < r) {
            System.out.println("Invalid input! n should be greater than or equal to r.");
            return;
        }

        // Calculate factorials
        int nFactorial = factorial(n);
        int rFactorial = factorial(r);
        int nRFactorial = factorial(n - r);

        // Calculate NcR and NpR
        int NcR = nFactorial / (rFactorial * nRFactorial);
        int NpR = nFactorial / nRFactorial;

        // Output the results
        System.out.println("NcR (Combination): " + NcR);
        System.out.println("NpR (Permutation): " + NpR);
    }
}
