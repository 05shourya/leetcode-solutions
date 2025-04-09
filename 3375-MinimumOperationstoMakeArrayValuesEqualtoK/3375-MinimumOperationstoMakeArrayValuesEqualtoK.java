// Last updated: 4/9/2025, 2:13:52 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        Set<Integer> seen = new HashSet<>();  
        
        for(int num : nums){
            if(num < k) return -1; 
            if(seen.add(num)){
                q.add(num); 
            }
        }

        int count = 0; 

        while(!q.isEmpty()){
            int val = q.poll(); 
            if(val != k){
                count++; 
            }
        }

        return count; 
    }
}