import java.util.HashMap;

public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        int count =0,sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for(int i:nums){
            sum+=i;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
            

        return count;
    }
    

    public static void main(String[] args) {
        int nums[] = {1,2,3};
        int k = 3;
        System.out.println(subarraySum(nums, k));
    }
}
