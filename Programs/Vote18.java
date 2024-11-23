import java.util.Scanner;

public class Vote18 {
    public static double isVote(int num1){
        return Math.PI*Math.pow(num1,2);





    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(isVote(num));
        input.close();
    }
}
