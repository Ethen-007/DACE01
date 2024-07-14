class UniquePath{
  public int uniquePath(int m , int n){//m is the row and n is column
    if(m < n){
      return uniquePath(n,m);
    }

    int[] dp = new int[n];

    //initializing the first row 
    for(int i=0 ; i<n ;i++){
      dp[i] = 1;
    }

    for(int i = 1; i < m; i++ ){
      for(int j = 1; j< n ; j++){
        dp[i] += dp[i-1];
      }
    }
    return dp[n-1];
  }

  public static void main(String[] args){
    UniquePath solution = new UniquePath();
    System.out.println("3*3 grid : " + solution.uniquePath(3,3);
    System.out.println("7*3 grid: " + solution.uniquePath(7,3);
  }
}
      
    
