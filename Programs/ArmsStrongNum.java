package anshul;
import java.util.Scanner;

public class ArmsStrongNum {
    // this program only valid for three digit only.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three digit number: ");
        int n = input.nextInt();
        int temp = n;
        int sum  = 0;
        while (temp > 0) {  // Use while loop instead of for
            int z = temp % 10;
            // This is a good practice because Math.pow() returns a floating-point value
            sum += (int) Math.pow(z, 3);  // z^3 for Armstrong number
            temp /= 10;
        }
        System.out.println("Sum of cubes of digits: " + sum);

        if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
