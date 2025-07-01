// Last updated: 7/1/2025, 11:04:28 PM
class Solution {
    private boolean canRob(int[] nums , int k , int capability){
        int count = 0; 
        int i = 0; 

        while(i < nums.length){
            if(nums[i] <= capability){
                count++; 
                i += 2; 
            }else{
                i++;
            }

            if(count >= k){
                return true; 
            }
        }
        return false; 
    }
    
    public int minCapability(int[] nums, int k) {
        int left = Integer.MAX_VALUE, 
        right = Integer.MIN_VALUE; 

        for(int num : nums){
            left = Math.min(left , num); 
            right = Math.max(right , num); 
        }

         while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (canRob(nums, k, mid)) {
                right = mid; 
            } else {
                left = mid + 1;
            }
        }
        
        return left; 
    }
}