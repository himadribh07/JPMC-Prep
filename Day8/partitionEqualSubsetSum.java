package Day8;

import java.util.Arrays;

public class partitionEqualSubsetSum {
    //recusion code
    // public static boolean canPartition(int[] nums) {
    //     int sum=0;
    //     for(int i:nums){
    //         sum+=i;
    //     }
    //     if(sum%2!=0)
    //         return false;
        
    //     return dfs(nums,sum/2,0);
       
    //     //do subset sum problem leetcode
    // }

    // static boolean dfs(int[] nums, int sum, int idx){
        
    //     if(sum==0)
    //         return true;

    //     if(idx>=nums.length)
    //         return false;
        
    //     boolean take = false;
    //     if(sum>=nums[idx])
    //         take = dfs(nums,sum-nums[idx],idx+1); //pick
    //     boolean notTake = dfs(nums,sum,idx+1); //not pickup

    //     return take || notTake;
    // }
    
    static int[][] t = new int[201][20001];
    public static boolean canPartition(int[] nums){
        int sum=0;
        for(int i:nums){
            sum+=i;
        }

        Arrays.fill(t,-1);
        if(sum%2!=0)
            return false;
        
        return dfs(nums,sum/2,0);
    }

    static boolean dfs(int [] nums, int sum, int idx){

        if(sum==0)
            return true;
        
        if(idx>=nums.length)
            return false;
        
        
        if(t[idx][sum]!=-1)
            return t[idx][sum]==1;
        
        boolean take = false;
        if(nums[idx]<=sum)
            take = dfs(nums,sum-nums[idx],idx++);
        boolean notTake = dfs(nums,sum,idx++);

        t[idx][sum] = (take || notTake) ?1 :0;

        return (take || notTake);
        
        
        
    }






    public static void main(String[] args) {
        int [] nums = {1,2,5};
        System.out.println(canPartition(nums));
    }
}
