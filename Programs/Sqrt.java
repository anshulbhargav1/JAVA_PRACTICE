public class Sqrt {
    static int sqrt(int x){
        int start = 0;
        int end = x;
        int result = 0;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid*mid == x){
                return mid;
            }
            else if(mid*mid < x){
                result = mid;
                start = mid + 1;
            }
            else if(mid*mid > x){

                end = mid -1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sqrt(2147395599));

    }
}
