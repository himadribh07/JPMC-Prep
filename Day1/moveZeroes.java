import java.util.Arrays;

class Solution3 {
    //Approach 1 -> Additional space ----------------------------------------
    // public static int [] moveZeroes(int[] arr) {
    //     int [] ans = new int[arr.length];
    //     int x=0;
    //     for(int i:arr){
    //         if(i!=0)
    //             ans[x++]=i;
    //     }

    //     for(int i=x;i<ans.length;i++){
    //         ans[x++]=0;
    //     }

    //     return ans;

    // }


    //Approach2------------------------------------------------------------

    public static void moveZeroes(int[] arr) {
        int pos=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[pos]=arr[i];
                pos++;
            }
        }

        while(pos<arr.length){
            arr[pos++]=0;
        }

    }
    public static void main(String[] args) {
        int arr [] = {0,1,0,3,12};
        moveZeroes(arr);

        System.out.println(Arrays.toString(arr));
    }
}   