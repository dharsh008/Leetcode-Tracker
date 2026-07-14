// Last updated: 14/07/2026, 14:11:30
class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }

        String result = "";
        int cycle = 2 * numRows - 2;

        for (int row = 0; row < numRows; row++) {

            for (int j = row; j < s.length(); j += cycle) {

                result += s.charAt(j);

                int diagonal = j + cycle - 2 * row;

                if (row != 0 &&
                    row != numRows - 1 &&
                    diagonal < s.length()) {

                    result += s.charAt(diagonal);
                }
            }
        }

        return result;
    }
}