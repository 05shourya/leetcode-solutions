// Last updated: 7/1/2025, 11:03:30 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        int totalSum = n * (n + 1) / 2;

        int k = n / m;  
        int sumDivisibleByM = m * (k * (k + 1)) / 2;

        return totalSum - 2 * sumDivisibleByM;
    }
}