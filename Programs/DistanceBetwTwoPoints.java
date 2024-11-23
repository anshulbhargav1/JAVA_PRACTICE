package anshul;

import java.util.Scanner;

public class DistanceBetwTwoPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first points Coordinate: ");
        double x1 = input.nextDouble();
        double x2 = input.nextDouble();
        System.out.print("enter the second points Coordinate: ");
        double y1 = input.nextDouble();
        double y2 = input.nextDouble();
        double dis = Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
        System.out.println("distance between two numbers: " + dis);
    }
}
