// Last updated: 7/1/2025, 11:03:27 PM
class Solution {
    public long minimumSteps(String s) {
        long steps = 0;
        long blackCount = 0;
        long whiteCount = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                blackCount++;
            } else {
                steps += blackCount;
            }
        }

        return steps;
    }
}
