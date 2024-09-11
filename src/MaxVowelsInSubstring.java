class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int curr = 0;
        
        // Count vowels in the first k characters
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                curr++;
            }
        }
        
        int maxVowels = curr;
        
        // Sliding window approach
        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                curr++;
            }
            if (vowels.contains(s.charAt(i - k))) {
                curr--;
            }
            maxVowels = Math.max(maxVowels, curr);
        }
        
        return maxVowels;
    }
}
