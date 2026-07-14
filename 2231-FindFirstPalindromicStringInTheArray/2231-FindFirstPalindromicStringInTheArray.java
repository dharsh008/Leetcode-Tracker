// Last updated: 14/07/2026, 14:10:55
class Solution {
    public String firstPalindrome(String[] words) {

        for (String word : words) {

            int left = 0;
            int right = word.length() - 1;

            while (left < right) {
                if (word.charAt(left) != word.charAt(right)) {
                    break;
                }
                left++;
                right--;
            }

            if (left >= right) {
                return word;
            }
        }

        return "";
    }
}