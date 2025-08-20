import java.util.*;
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i-1]==nums[i])
                continue;
            int left=i+1,right=nums.length-1;

            while(left<right){
                int sum=nums[left]+nums[right]+nums[i];
                if(sum>0)
                    right--;
                else if(sum<0)
                    left++;
                else{
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                
                    while(left<right && nums[left]==nums[left+1])
                        left++;
                    while(left<right && nums[right]==nums[right-1])
                        right--;

                    left++;
                    right--;
                } 
                    
            }
        }

        return ans;
    }

    public static void main(String[] args){
        int [] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
