// Last updated: 7/1/2025, 11:04:19 PM
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;  
        int[] leftSumArr = new int[n];
        int[] rightSumArr = new int[n];
        int[] ans = new int[n];
        int leftSum = 0; 
        int rightSum = 0;
        for(int i = 0 ; i < n; i++){
            leftSumArr[i] = leftSum;
            rightSumArr[n - i - 1] = rightSum; 
            leftSum += nums[i]; 
            rightSum += nums[n - i - 1]; 
        }

        for(int i = 0 ; i < n ; i++){
            ans[i] = Math.abs(leftSumArr[i] - rightSumArr[i]); 
        }

        return ans; 

    }
}