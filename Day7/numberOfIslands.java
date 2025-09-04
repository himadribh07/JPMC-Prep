package Day7;

public class numberOfIslands {
    static int m,n;
    public static int numIslands(char[][] grid) {
        
        m = grid.length;
        n = grid[0].length;
        int count=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    count++;
                    helper(grid,i,j);
                }
                
            }
        }
        
        return count;
        
    }

    public static void helper(char[][] grid,int row,int col){
        if(row<0 || col <0 || row>=m || col>=n || grid[row][col]=='0')
            return;
        
        grid[row][col]='0';
        helper(grid,row-1,col);
        helper(grid,row,col-1);
        helper(grid,row+1,col);
        helper(grid,row,col+1);

    }
    public static void main(String[] args) {
    char[][] grid = {
        {'1','1','0','0','0'},
        {'1','1','0','0','0'},
        {'0','0','1','0','0'},
        {'0','0','0','1','1'}
    };
        System.out.println(numIslands(grid));
    }
}
