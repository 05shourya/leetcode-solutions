// Last updated: 5/1/2025, 2:20:26 AM
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int x : nums) {
            int digits = 0;
            for (; x > 0; x /= 10)
                digits++;
            if ((digits & 1) == 0)
                count++;
        }
        return count;
    }
}