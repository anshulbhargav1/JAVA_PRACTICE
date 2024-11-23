package anshul;

import java.util.Scanner;

public class ElectricityBill{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the current reading: ");
        double currentReading = input.nextDouble();
        System.out.print("enter the previous reading: ");
        double previousReading = input.nextDouble();
        System.out.print("enter the tariff rate: ");
        double tariffRate = input.nextDouble();
        double electricityBill = (currentReading - previousReading)*tariffRate;
        System.out.print("your electricity Bill is : ");
        System.out.println(electricityBill);
    }

}
