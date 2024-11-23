package anshul;

import java.util.Scanner;

public class PrimeCheck {

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c <= n){
            if(n%c == 0){
                return false;

            }
            c++;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean prime = isPrime(n);
        System.out.println("number is: " + prime);


    }
}
