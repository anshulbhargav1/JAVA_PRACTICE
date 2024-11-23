package anshul;


import java.util.Scanner;

public class CompoundInterrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the principal amount: ");
        double principal = input.nextDouble();
        System.out.println("enter the rate of interest: ");
        double rate = input.nextDouble();
        System.out.println("enter the time : ");
        int time = input.nextInt();
        double ci = principal*Math.pow((1 + (rate/100)), time);
        System.out.println("C.I : " + ci);
    }
}
