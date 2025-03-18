class Solution {
    public int longestNiceSubarray(int[] nums) {
        int l = 0, mask = 0, maxLen = 0;

        for (int r = 0; r < nums.length; r++) {
            while ((mask & nums[r]) != 0) {
                mask ^= nums[l]; 
                l++;
            }
            
            mask |= nums[r];

            maxLen = Math.max(maxLen, r - l + 1);
        }
        
        return maxLen;
    }
}
