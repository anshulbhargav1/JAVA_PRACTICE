package anshul;

import java.util.Scanner;

//    public static int Hcf(int n){
//        int z;
//        int result = 1;
//        for(int i = 2; i <= n; i++){
//            while(n % i == 0){
//                z = n/i;
//                result *= i;
//                n = z;
//            }
//        }
//        return result;

public class Hcf {
        public static int HcfOfTwoNum(int a, int b){
            while(b != 0){
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;


        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("enter the two numbers: ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int result = HcfOfTwoNum(num1,num2);
            System.out.println("Hcf of " + num1 + " and " + num2 + " is: "+ result);

        }

}
