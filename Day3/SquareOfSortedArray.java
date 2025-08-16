import java.util.*;
public class SquareOfSortedArray {
    public static int[] squareOfSortedArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = {-4, -1, 0, 3, 10};
        int[] result = squareOfSortedArray(nums);
        System.out.println(Arrays.toString(result));
    }
}
