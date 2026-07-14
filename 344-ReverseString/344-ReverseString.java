// Last updated: 14/07/2026, 14:11:03
class Solution {
    public void reverseString(char[] s) {
        int r=s.length-1;
        int l=0;
        while(l<r){
            char t=s[l];
            s[l]=s[r];
            s[r]=t;
            l++;
            r--;
        }

        
    }
}