public class containerWithMostWater {
    public static int maxArea(int[] height) {
        int area=0,maxArea=0;
        int left=0,right=height.length-1;

        while(left<right){
            area=(right-left)*(Math.min(height[right],height[left]));
            maxArea=Math.max(area,maxArea);
            if(height[left]<height[right])
                left++;
            else
                right--;
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
