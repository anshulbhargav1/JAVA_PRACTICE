public class Palindrome {
    public static void main(String[] args) {
        int num = 12321;
//        int orginalNum = num;
//        int result = 0;
//        while (num > 0){
//            int digit  = num % 10;
//            num /= 10;
//            result = result*10 + digit;
//        }
//
//        if(result == orginalNum){
//            System.out.println(orginalNum+"  : number is palindrome");
//        }
//        else{
//            System.out.println(orginalNum+ "   : number is not pallindrome");
//        }
//
        String forwardNum = new String(""+num);
        StringBuffer sb = new StringBuffer(forwardNum);
        sb.reverse();
        String BackwardNum = sb.toString();
        if(forwardNum.equals(BackwardNum)){
            System.out.println(num+"number is palindrome");
        }
        else{
            System.out.println(num+"number is not palindrome");
        }



        // Approach Second....
        /* String ForwardNum = "";
        String BackwardNum = "";

        while(num > 0){
            int digit = num % 10;
            num /= 10;
            ForwardNum = digit + "" + ForwardNum;
            BackwardNum = BackwardNum + "" + digit;

        }
        System.out.println(ForwardNum);
        System.out.println(BackwardNum);

        if(ForwardNum.equals(BackwardNum)){
            System.out.println(orginalNum + " : is palindrome");
        }
        else{
            System.out.println(orginalNum+" : is not palindrome");
        } */

    }
}
