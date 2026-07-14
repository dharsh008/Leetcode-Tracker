// Last updated: 14/07/2026, 14:10:56
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int s=0;
        int n=nums.length;
        for(int i=0;i<n;i=i+2){
            s=s+nums[i];
        }
    return s;    
    }
}