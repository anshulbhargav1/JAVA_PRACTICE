
public class MaxWealth {
    static int BinarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[0]<arr[end];

        while(start <= end){
            int mid = start + (end - start)/2 ;
            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {99,88,77,55,34,3};
        int target = -34;
        int ans = BinarySearch(arr1,target);
        System.out.println(ans);



    }
}



