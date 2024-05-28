
import java.util.HashSet;
public class uniqueSubsequence {
    public static void subsequences(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
            }
            return; // Return after processing the base case
        }

        char currChar = str.charAt(idx);
        // Include the current character
        subsequences(str, idx + 1, newString + currChar, set);
        // Exclude the current character
        subsequences(str, idx + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "abcd";
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "", set); // Start with an empty string
    }
}
