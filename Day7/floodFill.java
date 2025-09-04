package Day7;

import java.util.Arrays;

public class floodFill {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int oldColor = image[sr][sc];
        if(oldColor == color)
            return image;

        dfs(image,sr,sc,color,oldColor);
        return image;
    }

    public static void dfs(int[][] image, int r, int c, int color,int oldColor){

        if(r<0 || c<0 || r>=image.length || c>=image[0].length || image[r][c]!=oldColor)
            return;
        
        image[r][c]=color;

        dfs(image, r-1, c, color, oldColor);
        dfs(image, r+1, c, color, oldColor);
        dfs(image, r, c-1, color, oldColor);
        dfs(image, r, c+1, color, oldColor);
    }
    public static void main(String[] args) {
        int [][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr =1;
        int sc =1;
        int color = 2;

        System.out.println(Arrays.deepToString(floodFill(image, sr, sc, color)));
    }
}
