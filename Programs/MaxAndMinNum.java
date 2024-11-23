import java.util.Scanner;

public class MaxAndMinNum {
    public static int MaxNum(int first, int second, int third){
        int max = first;
        if(second > max){
            max = second;
        }
        if(third > max){
            max = third;
        }
        return max;

    }
    public static int MinNum(int first, int second, int third){
        int min = first;
        if(second < min){
            min = second;
        }
        if(third < min){
            min = third;
        }
        return min;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first number: ");
        int n = input.nextInt();
        System.out.print("enter the second number: ");
        int m = input.nextInt();
        System.out.print("enter the third number: ");
        int o = input.nextInt();
        System.out.println("max value among three numbers is: " + MaxNum(n,m,o));
        System.out.println("max value among three numbers is: " + MinNum(n,m,o));
        input.close();




    }
}
