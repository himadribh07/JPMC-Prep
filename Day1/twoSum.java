import java.util.HashMap;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int ans [] = new int[2];

        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];

            if(map.containsKey(diff)){
                ans[0]=map.get(diff);
                ans[1]=i;
                break;
            }

            map.put(nums[i],i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {3,2,4};
        int target = 6;
        int result[] = twoSum(nums, target);
        System.out.println(result[0] + ", " + result[1]); // 0, 1
    }
}