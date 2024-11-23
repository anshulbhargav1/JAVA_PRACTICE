package anshul;

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the cost of the Asset: ");
        int costAsset = input.nextInt();
        System.out.print("Enter the Salvage value: ");
        int salvage = input.nextInt();
        System.out.print("Enter the Useful life (in years): ");
        int usefulLife = input.nextInt();
        int depreciation = (costAsset - salvage)/usefulLife;
        System.out.println("depreciation is: " + depreciation);
    }
}
