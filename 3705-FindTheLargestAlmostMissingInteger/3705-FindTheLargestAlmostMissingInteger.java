// Last updated: 7/1/2025, 11:02:15 PM
class Solution {
    public int largestInteger(int[] nums, int k) {
        Map<Integer , Integer> map = new HashMap<>(); 
        for(int i = 0 ; i <= nums.length - k; i++){
            Set<Integer> set = new HashSet<>(); 
            for(int j = i ; j < i + k; j++){
                set.add(nums[j]); 
            }

            for(int num : set){
                map.put(num , map.getOrDefault(num , 0) + 1); 
            }
        }
        int max = -1; 
        for(int num : nums){
            if(map.get(num) == 1){
                max = Math.max(max , num); 
            }
        }
        
        return max; 
    }
}