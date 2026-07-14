// Last updated: 14/07/2026, 14:11:20
class Solution {
    public int mySqrt(int x) {
        int i=1;
        while((long)i*i<=x){
            i++;
        
        }
        return i-1;
    }
}