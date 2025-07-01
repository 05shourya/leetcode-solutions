// Last updated: 7/1/2025, 11:02:45 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleDigitSum = 0 ; 
        int doubleDigitSum = 0 ;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] - 10 >= 0 ){
                doubleDigitSum += nums[i]; 
            }else{
                singleDigitSum += nums[i]; 
            }
        }
        return doubleDigitSum != singleDigitSum; 
    }
}