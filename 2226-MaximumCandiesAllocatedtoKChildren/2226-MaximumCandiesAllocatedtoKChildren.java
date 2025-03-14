class Solution {
    private boolean canAssign(int[] candies, long k , int value){
        long total = 0; 
        for(int candy : candies){
            total += candy/value; 
        }

        return total >= k; 
    }
    
    public int maximumCandies(int[] candies, long k) {
        int high = 0; 
        int low = 1; 
        for(int candy: candies){
            high = Math.max(candy, high); 
        }

        while(low <= high){
            int mid = low + (high - low)/2 ; 
            if(canAssign(candies, k , mid)){
                low = mid + 1; 
            }else{
                high = mid - 1; 
            }
        }

        return low - 1; 
        
    }
}