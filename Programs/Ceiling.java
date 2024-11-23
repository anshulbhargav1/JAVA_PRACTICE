public class Ceiling {
    static int ceilingArr(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end -start)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid -1 ;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr1 = {2,3,5,7};
        int tar = 9;
        int ans = ceilingArr(arr1,tar);
        System.out.println(ans);


    }
}
