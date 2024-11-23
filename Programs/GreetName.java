package anshul;

import java.util.Scanner;

public class GreetName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the name: ");
        String name  = input.nextLine();
        System.out.println(name + " " + "good morning");
    }
}
