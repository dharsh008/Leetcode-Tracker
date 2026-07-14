// Last updated: 14/07/2026, 14:10:53
class Solution {
    public String capitalizeTitle(String title) {

        String[] word = title.split(" ");
        String r = "";

        for (int i = 0; i < word.length; i++) {

            if (word[i].length() <= 2) {
                r += word[i].toLowerCase();
            } else {
                r += Character.toUpperCase(word[i].charAt(0))
                        + word[i].substring(1).toLowerCase();
            }

            if (i != word.length - 1) {
                r += " ";
            }
        }

        return r;
    }
}