package anshul;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        int m = input.nextInt();
        int n = 1;
        for(int i = 1; i <= m; i++){
            n *= p;
        }
        System.out.println(n);
    }
}
