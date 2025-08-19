import java.util.*;
class DailyTemp{

    public static int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int [] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && temperatures[i]>=temperatures[st.peek()]){
                st.pop();
            }

            if(st.isEmpty())
                ans[i]=0;
            else    
                ans[i]=st.peek()-i;

            st.push(i);
        }

        return ans;
    }



    public static void main(String[] args) {
        int [] temperatures = {73,74,75,71,69,72,76,73};
        int [] result = dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(result));
    }
}