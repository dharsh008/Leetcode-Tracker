// Last updated: 14/07/2026, 14:11:14
class Solution {
    public int singleNumber(int[] nums) {
        int r=0;
        for(int num:nums){
            r^=num;
        }
        return r;
    }
}