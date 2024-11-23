package anshul;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int num = input.nextInt();
        switch (num) {
            case 1:
                System.out.println("you got 1st rank");
                break;
            case 2:
                System.out.println("you got 2nd rank");
                break;
            default:
                System.out.println("enter a valid number");
                break;
        }
    }
}
