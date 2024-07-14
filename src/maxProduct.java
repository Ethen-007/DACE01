public class Solution{
  public int maxProduct(int[] nums){
    if(nums == null || nums.length == 0) return 0;
    int minP = nums[0];
    int maxP = nums[0];
    int maxProduct = nums[0];
    for(int i = 1;i<nums.length;i++){
      int num = nums[i];
      int temp = minP;
      minP = Math.min(num , Math.min(num*minP,num*maxP));
      maxP = Math.max(num , Math.max(num*temp , num*maxP));
      maxProduct = Math.max(maxP, maxProduct);
    }
    return maxProduct;
  }
}
      
