public class EditDistance {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m + 1][n + 1];

        // Initialize the distances for the empty substrings
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i; // Deleting all characters from word1
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j; // Inserting all characters to word1 to form word2
        }

        // Fill the dp array
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // Characters match, no extra cost
                } else {
                    dp[i][j] = Math.min(
                        dp[i - 1][j] + 1,    // Deletion
                        Math.min(dp[i][j - 1] + 1,    // Insertion
                        dp[i - 1][j - 1] + 1) // Replacement
                    );
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        EditDistance solution = new EditDistance();
        String word1 = "horse";
        String word2 = "ros";
        System.out.println("The minimum number of operations required: " + solution.minDistance(word1, word2)); // Output: 3
    }
}
