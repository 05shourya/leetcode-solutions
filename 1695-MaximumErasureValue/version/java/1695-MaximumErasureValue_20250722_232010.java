// Last updated: 7/22/2025, 11:20:10 PM
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); 
        int res = 0; 
        int curr = 0; 
        int i = 0 , j = 0; 

        while(i < nums.length && j < nums.length){
            if(map.getOrDefault(nums[j] , 0) == 0){
                curr += nums[j]; 
                map.put(nums[j] , 1); 
                j++; 
            }else{
                curr -= nums[i]; 
                map.put(nums[i] , 0); 
                i++; 
            }
            res = Math.max(res , curr); 
        }

        return res; 
        
    }
}