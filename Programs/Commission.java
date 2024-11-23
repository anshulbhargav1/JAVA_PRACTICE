package anshul;

import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the total revenue generate by your: ");
        double totalRevenue = input.nextDouble();
        System.out.print("enter the commission rate: ");
        double commissionRate = input.nextDouble();
        double commission = (totalRevenue * commissionRate)/100;
        System.out.println("your commission is: " + commission);
    }
}
