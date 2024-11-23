package anshul;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = input.nextInt();
        int result = 0;
        for(int i = 1; i < n; i++){
            if(n%i == 0){
                result += i;
            }
        }
        if(result == n){
            System.out.println(n + " is perfect number");
        }
        else{
            System.out.println(n + " is not perfect number");
        }
    }
}
