// Last updated: 14/07/2026, 14:11:24
class Solution {
    public int maxSubArray(int[] nums) {
        int msum=nums[0];
        int csum=nums[0];
        for(int i=1;i<nums.length;i++){
          csum=Math.max(nums[i],csum+nums[i]);
          msum=Math.max(msum,csum);
       } 
       return msum;
    }
}