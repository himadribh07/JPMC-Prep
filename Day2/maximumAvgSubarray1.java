class maxAvg{
    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum=0;   
        
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int maxSum= sum;

        int start=0,end = k;

        while(end<n){
            sum+=nums[end];
            end++;
            sum-=nums[start];
            start++;

            maxSum=Math.max(maxSum,sum);
        }

        return(double) maxSum/k;
    }

    // public static double findAvg(int[] nums, int start, int n,int k){
    //     int sum=0;
    //     for(int j=start;j<n;j++){
    //         sum+=nums[j];
    //     }

    //     return sum/k;
    // }

    public static void main(String[] args) {
        int [] nums = {1,12,-5,-6,50,3};
        int k=4;
        System.out.println(findMaxAverage(nums, k));
    }
}