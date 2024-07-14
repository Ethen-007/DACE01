import java.util.*;
public class Solution{
    public int[] countBits(int n){
        int[] result = new int[n+1];
        for(int i=1;i<=n;i++){
            result[i] = result[i/2] + i%2;
        }
        return result;
    }
}
public static void main(String[] args){
    Solution sol = new Solution();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = Scanner.nextInt();
    int[] bitsCount = sol.countBits(n);
    System.out.println(Arrays.toString(bitsCount));
    scanner.close();
}
