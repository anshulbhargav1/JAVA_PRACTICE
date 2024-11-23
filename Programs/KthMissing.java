public class KthMissing {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 9;
        int[] newarr = new int[1000];
        int i = 0;
        int j = 0;
        for( int count = 1; count <= 1000; count++){
            if(i < arr.length){
                if(arr[i] == count){
                    i++;
                }else{
                    newarr[j] = count;
                    j++;
                }
            }
        }
        System.out.println(newarr[k]);
    }
}
