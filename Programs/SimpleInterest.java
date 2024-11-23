package anshul;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the principal: ");
        int prn = input.nextInt();
        System.out.print("enter the time: ");
        int time = input.nextInt();
        System.out.print("enter the rate: ");
        int rate = input.nextInt();
        int SI = (prn*time*rate)/100;
        System.out.println("SI: " + " " + SI);

    }
}
