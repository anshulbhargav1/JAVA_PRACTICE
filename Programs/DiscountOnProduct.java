package anshul;

import java.util.Scanner;

public class DiscountOnProduct {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the price of product: ");
        double price = input.nextDouble();
        System.out.print("enter the discount percentage: ");
        double discount = input.nextDouble();
        double getDiscount = (price*discount)/100;
        double paidPrice = (price - getDiscount);
        System.out.println("you have pay after discount is: " + paidPrice);
    }
}
