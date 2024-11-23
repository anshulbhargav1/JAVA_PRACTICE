package anshul;

public class ReverseNum {
    public static void main(String[] args) {
        int n = 23456;
        int ans = 0;
        while (n > 0){
            // get last number by %10
            int rem = n % 10;
            // remove the last digit
            n /= 10;
            // add another number
            ans = ans*10 + rem;
        }
        System.out.println(ans);
    }
}
