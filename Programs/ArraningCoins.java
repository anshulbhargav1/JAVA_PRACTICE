public class ArraningCoins {
    public static void main(String[] args) {
        int n  = 9;
        int low = 1;
        int high = n;
        int mid = low + (high - low)/2;
        while(low <= high){

            int sum = mid*(mid+1)/2;
            if(sum == n){
                System.out.println(mid);
                break;
            }
            else if(sum > n){
                if((sum-mid) < n){
                    System.out.println(mid - 1);
                    break;
                }
                mid = mid - 1;
            }else{
                mid = mid + 1;
            }
        }
        System.out.println();
    }

}
