// Last updated: 7/1/2025, 11:03:06 PM
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length == 1) return 1; 
        int increasing = 1 , decreasing = 1; 
        int maxLen = 1; 

        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] == nums[i - 1]){
                increasing = 1; 
                decreasing = 1; 
            }else{
                if(nums[i] > nums[i - 1]){
                    increasing++; 
                    decreasing = 1; 
                    maxLen = Math.max(maxLen , increasing); 
                }else{
                    decreasing++; 
                    increasing = 1; 
                    maxLen = Math.max(maxLen , decreasing); 
                }
            }
        }
        return maxLen; 
    }
}