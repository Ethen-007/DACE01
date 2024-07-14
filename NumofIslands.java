public class NumofIslands{
  public int numofIslands(char[][] grid){
    if(grid == null|| grid.length == 0 ){
      return 0;
    }
    int numIsLands = 0;
    int rows = grid.length;
    int cols = grid[0].length;

  for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
      if(grid[i][j] == '1'){
        numIsLands +=1;
        dfs(grid ,i,j);
      }
    }
  }
    return numIsLands;
  private void dfs(char[][] grid, int row ,int col){
    int rows = grid.length;
    int cols = grid[0].length;
    if(row<0 || row >= rows || col < 0 || col >= cols || grid[i][j] =='0'){
        return;
    }
    grid[row][col]=='0';
    dfs(grid,row-1,col);
    dfs(grid,row+1,col);
    dfs(grid,row,col+1);
    dfs(grid,row,col-1);
  }
  }
    
