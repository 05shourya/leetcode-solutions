// Last updated: 12/7/2025, 8:07:45 PM
1class Solution {
2    public int countOdds(int low, int high) {
3        low = low % 2 != 0 ? low - 1 : low; 
4        high = high % 2 != 0 ? high + 1 : high; 
5
6        return (high - low) / 2; 
7    }
8}