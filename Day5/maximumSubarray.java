package Day5;

public class maximumSubarray {
    public static int maxSubArray(int[] nums) {
        int sum=nums[0],maxSum=nums[0];

        for(int i=1;i<nums.length;i++){
            if(sum<0)
                sum=0;
            sum+=nums[i];
            maxSum=Math.max(sum,maxSum);
        }

        return maxSum;

    }
    public static void main(String[] args) {
        int [] nums = {5,4,-1,7,8};
        System.out.println(maxSubArray(nums));
    }
}
