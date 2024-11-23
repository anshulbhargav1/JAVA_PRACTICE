public class NegativeNum {
    public static void main(String[] args) {
        int[] arr = {10,2,-1,-2,-3};
        int count = 0;
        int low = 0;
        int high = arr.length-1;
        while (low <= high) {
            int mid  = low + (high-low)/2;
            if(arr[mid] < 0){
                 high = mid-1;
            }
            else{
                low = mid+1;
            }
            if(arr[mid] == 0){
                count = mid;
                break;
            }
            count = mid;
        }
        System.out.println(arr.length - 1 -count);
    }
}
