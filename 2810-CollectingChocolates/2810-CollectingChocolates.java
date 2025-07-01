// Last updated: 7/1/2025, 11:04:06 PM
class Solution {

public long minCost(int[] nums, int x) {
        int n = nums.length;
        int[] min_cost = new int[n];
        System.arraycopy(nums, 0, min_cost, 0, n);
        long ans = Long.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = 0; j < n; j++) {
                int rotatedIndex = (j + i) % n;
                min_cost[j] = Math.min(nums[rotatedIndex], min_cost[j]);
                sum += min_cost[j];
            }
            ans = Math.min(ans, sum + (long) i * x);
        }
        return ans;
    }
}