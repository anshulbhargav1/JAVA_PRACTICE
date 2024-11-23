package anshul;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the FibonacciSeries number: ");
        int num = input.nextInt();
        int a = 0, b = 1;
        System.out.print("FibonacciSeries: "+ a);
        if(num>1){
            System.out.print("," + b);
            for(int i = 3; i <= num; i++){
                int nextNum = a + b;
                System.out.print("," + nextNum);
                a = b;
                b = nextNum;
            }
        }
        System.out.println();
        input.close();
    }
}
