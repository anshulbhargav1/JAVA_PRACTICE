package anshul;
import java.util.Scanner;

public class Lcm {
    public static int LcmOfTwoNum(int a, int b){
        while( b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter two number : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result = (num1*num2)/LcmOfTwoNum(num1, num2);
        System.out.println("Lcm of " + num1 + " and " + num2 + " is: " + result);
    }
}
