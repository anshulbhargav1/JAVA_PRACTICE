public class Patter2 {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'g';
        int low = 0;
        int high = letters.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(letters[mid] > target){
                if(mid > 0){
                    if(letters[mid-1] <= target){
                        System.out.println(letters[mid]);
                    }
                }
                high = mid -1;
            }
            else if(letters[mid] < target){
                low = mid + 1;
            }
        }
        System.out.println(letters[0]);
    }
}
