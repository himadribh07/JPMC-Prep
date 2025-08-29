package Day6;

import java.util.Arrays;

public class climbingStairs {
    public static int climbStairs(int n) {
        int [] ans = new int [46];
        Arrays.fill(ans,-1);
        return helper(n,ans);
    }

    public static int helper(int n,int [] ans){

        if(n<=1)
            return 1;
        
        if(ans[n]!=-1)
            return ans[n];
        
        return ans[n] = helper(n-1, ans)+helper(n-2, ans);
    }
    public static void main(String[] args) {
        int n = 45;
        System.out.println(climbStairs(n));
    }
}
