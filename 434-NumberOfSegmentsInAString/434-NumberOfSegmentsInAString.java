// Last updated: 14/07/2026, 14:11:01
class Solution {
    public int countSegments(String s) {
        s = s.trim();

        if (s.length() == 0) {
            return 0;
        }

        return s.split("\\s+").length;
    }
}