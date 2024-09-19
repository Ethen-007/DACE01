import java.util.Arrays;

class NextPermutation {
    private void swap(int[] nums, int ind1, int ind2) {
        int temp = nums[ind1];
        nums[ind1] = nums[ind2];
        nums[ind2] = temp;
    }
    
    private void reverse(int[] nums, int beg, int end) {
        while (beg < end) {
            swap(nums, beg, end);
            beg++;
            end--;
        }
    }
    
    public void nextPermutation(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        if (nums.length == 2) {
            swap(nums, 0, 1);
            return;
        }
        int dec = nums.length - 2;
        while (dec >= 0 && nums[dec] >= nums[dec + 1]) {
            dec--;
        }
        reverse(nums, dec + 1, nums.length - 1);
        if (dec == -1) {
            return;
        }
        int nextNum = dec + 1;
        while (nextNum < nums.length && nums[nextNum] <= nums[dec]) {
            nextNum++;
        }
        swap(nums, nextNum, dec);
    }
}
