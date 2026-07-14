// Last updated: 14/07/2026, 14:11:07
class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length()){
         return false;
       }
       char[] a=s.toCharArray();
       char[] b=t.toCharArray();
       Arrays.sort(a);
       Arrays.sort(b);
       return Arrays.equals(a,b);
    }
}