// Last updated: 7/1/2025, 11:03:51 PM
class Solution {
    public int minimumIndex(List<Integer> nums) {
        int dominant = nums.get(0);
        Map<Integer, Integer> map = new HashMap<>(); 
        int max = 1; 
        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0) + 1); 
            if(map.get(num) > max){
                dominant = num; 
                max = map.get(num); 
            }
        }

        int right = map.get(dominant); 
        int left = 0; 

        for(int i = 0 ; i < nums.size() ; i++){
            if(nums.get(i) == dominant){
                left++; 
                right--; 
            }

            if(left > (i + 1) / 2 && right > (nums.size() - (i + 1)) / 2){
                return i; 
            }
        }

        return -1; 
    }
}