// Last updated: 14/07/2026, 14:11:25
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String wrds[]=s.split(" ");
        return wrds[wrds.length-1].length();
    }
}