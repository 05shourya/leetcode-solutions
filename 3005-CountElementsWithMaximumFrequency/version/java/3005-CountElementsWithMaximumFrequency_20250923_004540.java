// Last updated: 9/23/2025, 12:45:40 AM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); 
        int maxFreq = 0; 
        int maxElem = 0; 

        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0) + 1); 

            if(map.get(num) == maxFreq){
                maxElem += maxFreq; 
            } 

            if(map.get(num) > maxFreq){
                maxElem = map.get(num); 
                maxFreq = map.get(num); 
            }
            
        }

        return maxElem; 

    }
}