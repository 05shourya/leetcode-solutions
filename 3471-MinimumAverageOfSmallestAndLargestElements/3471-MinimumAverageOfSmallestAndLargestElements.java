// Last updated: 7/1/2025, 11:02:52 PM
class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double minAvg = Double.MAX_VALUE;

        for (int i = 0; i < nums.length / 2; i++) {
            double currentAvg = (nums[i] + nums[nums.length - i - 1]) / 2.0;
            if (currentAvg < minAvg) {
                minAvg = currentAvg;
            }
        }

        return minAvg;
    }
}