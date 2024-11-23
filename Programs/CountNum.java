package anshul;

import java.util.Scanner;

// Armstrong number is a number that is equal to the sum of cubes of its digits.
public class CountNum {
    public static void main(String[] args) {
        int n = 32323;
        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if (rem == 3 ){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);

    }
}
