// Last updated: 12/16/2025, 12:36:10 AM
1class Solution {
2    public long getDescentPeriods(int[] prices) {
3        long ans = 1, count = 1;
4        for(int i = 0; i < prices.length - 1; i++) {
5            if(prices[i] == prices[i + 1] + 1) count++;
6            else count = 1;
7            ans += count;
8        }
9        return ans;
10    }
11}