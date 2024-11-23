package anshul;

import java.util.Scanner;

public class TakeNumAndOpertor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("enter the second number: ");
        double num2 = input.nextDouble();
        System.out.print("enter the operator(+,-,*,/): ");
        char op = input.next().charAt(0);
        double result = 0;
        if(op == '+'){
            result = num1 + num2;
        }
        else if (op == '-'){
            result = num1 - num2;
        }
        else if (op == '*'){
            result = num1 * num2;
        }
        else if (op == '/'){
            if(num2 != 0){
                result = num1 / num2;
            }
            else {
                System.out.println("error");
                return;
            }
        }
        else{
            System.out.println("invalid");
            return;
        }
        System.out.println("the result is: " + result);


    }
}
