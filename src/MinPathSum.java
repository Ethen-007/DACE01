class MinPathSum{
  public int minPathSum(int[][] grid){
    if(grid == null || grid.length == null || grid[0].length == null){
      return 0;
    }
    int row = grid.length;
    int col = grid[0].length;
    //intializing dp
    int[][] dp = new int[row][col];

    dp[0][0] = grid[0][0];
    //initializing the first row
    for(int i=1;i<col;i++){
      dp[0][i] = dp[0][i-1] + grid[0][i];
    }
    //initializing the first col
    for(int j=1; j<row;j++){
      dp[j][0] = dp[j-1][0] + grid[j][0];
    }

    for(int i=1 ; i<row;i++){
      for(int j=1;j<col ; j++){
        dp[i][j] = Math.min(dp[i][j-1],dp[i-1][j]) + dp[i][j];
      }
    }
    return dp[row-1][col-1];
  }
}
    
