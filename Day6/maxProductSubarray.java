package Day6;

public class maxProductSubarray {
    public static int maxProduct(int[] nums) {
        int ans =nums[0];
        int minSoFar=nums[0];
        int maxSoFar=nums[0];

        for(int i = 1; i < nums.length; i++){

            int n = nums[i];

            if(n<0){
                int temp = maxSoFar;
                maxSoFar=minSoFar;
                minSoFar=temp;
            }
            
            minSoFar=Math.min(n,n*minSoFar);
            maxSoFar=Math.max(n,n*maxSoFar);
            ans = Math.max(ans,maxSoFar);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
}
