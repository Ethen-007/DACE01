public class nQueens {
    public static void main(String[] args) {
        int n=8;
        List<List<String>> solutions = solveNQueens(n);
        for(List<String> solution : solutions){
            for(String row: solution){
                System.out.println(row);
            }
            System.out.println();
        }
    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        int[] queens = new int[n];//index for representing the row and value for column

        solve(0,queens,solutions,n);
        return solutions;
    }
    public static void solve(int row,int[] queens,List<List<String>> solutions,int n) {
        if (row == n) {
            solutions.add(generateBoard(queens, n));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isValid(row, col, queens)) {
                queens[row] = col;
                solve(row + 1, queens, solutions, n);
            }
        }
        private static boolean isValid ( int row, int col, int[] queens){
            for (int i = 0; i < row; i++) {
                if (queens[i] == col || Math.abs(queens[i] - col) == Math.abs(i - row)) {
                    return false;
                }
            }
            return true;
        }
        private static List<String> generateBoard ( int[] queens, int n){
            List<String> board = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    if (queens[i] == j) {
                        sb.append("Q");
                    } else {
                        sb.append(".");
                    }
                }
                board.add(sb.toString());
            }
            return board;
        }
    }
    }

