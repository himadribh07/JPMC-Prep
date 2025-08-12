class Solution1 {
    public static int bestTimeToBuyStocks(int[] prices) {
        int i=0,j=1,profit =-1,mini=Integer.MAX_VALUE,maxi=Integer.MIN_VALUE;

        while(j<prices.length){
            mini = Math.min(prices[i],mini);
            maxi =  prices[j];

            profit = Math.max(maxi-mini,profit);

            i++;
            j++;
        }

        if(profit<0)
            return 0;
        return profit;
    }

    public static void main(String[] args) {
        int [] prices = {7,6,4,3,1};
        System.out.println(bestTimeToBuyStocks(prices));
    }
}