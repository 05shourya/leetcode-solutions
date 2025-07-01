// Last updated: 7/1/2025, 11:03:52 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count =0; 
        for(int hour : hours){
            if(hour >= target){
                count++; 
            } 
        }
        return count; 
    }
}