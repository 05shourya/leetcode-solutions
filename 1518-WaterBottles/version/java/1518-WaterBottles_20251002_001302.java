// Last updated: 10/2/2025, 12:13:02 AM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res =( (numBottles - 1) / (numExchange - 1)) + numBottles; 
        return res; 
    }
}