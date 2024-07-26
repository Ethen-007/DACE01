import java.util.HashSet;
public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        HashSet<Integer> numSet = new HashSet<>();
        for(int num:nums){
            numSet.add(num);
        }
        int longestStreak =0;
        for(int num:numSet){
            if(!numSet.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;
                while(numSet.contains(currentNum+1)){
                    currentNum +=1;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak,currentStreak);
            }
        }
        return longestStreak;
    }
    public static void main(String[] args) {
        LongestConsecutive longestConsecutive = new LongestConsecutive();
        int[] nums = {100,4,200,1,3,2};
        int result = longestConsecutive.longestConsecutive(nums);
        System.out.println("Length of the longest consecutive sequence"+ result);
    }
}
