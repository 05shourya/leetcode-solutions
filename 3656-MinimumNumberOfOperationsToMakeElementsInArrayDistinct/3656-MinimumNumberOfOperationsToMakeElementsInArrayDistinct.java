// Last updated: 7/1/2025, 11:02:22 PM
class Solution {
    public int minimumOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); 

        for(int i = nums.length - 1 ; i >= 0 ; i--){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1); 
            if(map.get(nums[i]) > 1){
                return (i + 3) / 3; 
            }
        }

        return 0; 
    }
}