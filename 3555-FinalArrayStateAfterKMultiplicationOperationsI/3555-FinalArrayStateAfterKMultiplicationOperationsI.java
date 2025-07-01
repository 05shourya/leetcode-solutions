// Last updated: 7/1/2025, 11:02:41 PM
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int[] minIndex = new int[2]; 

        for(int i = 0 ; i < k ; i++){
            minIndex = getMin(nums); 
            nums[minIndex[1]] = minIndex[0] * multiplier; 
        }
        
        return nums; 
    }

    private int[] getMin(int[] nums) {
        int min = Integer.MAX_VALUE; 
        int index = 0; 

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] < min){
                min = nums[i]; 
                index = i; 
            }
        }
        return new int[] {min , index}; 
    }
}