// Last updated: 7/1/2025, 11:03:11 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        Queue<Integer> heap = new PriorityQueue<>(); 

        for(int num : nums) {
            if(num < k) heap.offer(num); 
        }

        int count = 0; 

        while(!heap.isEmpty()){
            int x = heap.poll();
            count++; 
            
            if(heap.isEmpty()) break; 
            
            int y = heap.poll(); 

            long z = 2L * x + y; 
            
            if(z < k) heap.offer((int)z); 
        }

        
        return count; 
    }
}