// Last updated: 7/1/2025, 11:02:37 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> set = new HashSet<>(); 
        for(int num : nums){
            if(num < k) return -1; 
            else if (num > k) set.add(num);  
        }

        return set.size(); 
    }
}