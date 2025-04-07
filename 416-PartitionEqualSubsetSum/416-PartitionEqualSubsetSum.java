// Last updated: 4/7/2025, 7:15:07 PM
class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0; 
        for(int num : nums){
            sum+= num; 
        }

        if(sum % 2 != 0) return false; 

        int target = sum / 2 ; 
        int n = nums.length; 
        boolean dp[][] = new boolean[n + 1][target + 1]; 
        
        for(int i = 0 ; i < n ; i++){
            dp[i][0] = true; 
        }

        for(int i = 1; i <= n ; i++){
            for(int j = 1 ; j <= target ; j++){
                if(nums[i - 1] <= j){
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i -1]]; 
                }else{
                    dp[i][j] = dp[i - 1][j]; 
                }
            }
        }

        return dp[n][target]; 
    }
}