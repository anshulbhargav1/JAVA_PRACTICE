import java.util.ArrayList;

public class Intersection_of_Two_Arrays {
    public static void main(String[] args) {
        int[] nums1 = {7, 4, 5,7,2};
        int[] nums2 = {2, 3, 4, 5};
        ArrayList<Integer> nums = new ArrayList<>();
        for (int k : nums1) {
            for (int i : nums2) {
                if (k == i) {
                    nums.add(k);
                }
            }
        }
        System.out.println(nums);

    }
}
