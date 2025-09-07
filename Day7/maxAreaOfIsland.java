package Day7;

public class maxAreaOfIsland {
    static int n,m;
    public static int maxAreaOfIsland(int[][] grid) {
        int area=0,maxArea=0;

        m = grid.length;
        n = grid[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    area = dfs(grid,i,j);
                    maxArea=Math.max(maxArea,area);
                }
                    
            }
        }
        return maxArea;
    }

    public static int dfs(int[][] grid,int i,int j){
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]==0)
            return 0;
        
        grid[i][j]=0;

        return 1+ dfs(grid, i-1, j)+
                dfs(grid, i+1, j)+
                dfs(grid, i, j-1)+
                dfs(grid, i, j+1);
    }
    public static void main(String[] args) {
        int grid[][] = {
            {0,0,1,0,0,0,0,1,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,1,1,0,1,0,0,0,0,0,0,0,0},
            {0,1,0,0,1,1,0,0,1,0,1,0,0},
            {0,1,0,0,1,1,0,0,1,1,1,0,0},
            {0,0,0,0,0,0,0,0,0,0,1,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };

        System.out.println(maxAreaOfIsland(grid));
        
    }
}
