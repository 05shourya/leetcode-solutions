class Solution {
    public long repairCars(int[] ranks, int cars) {
        long low = 1 , 
        high = (long) Arrays.stream(ranks).min().getAsInt() * cars * cars; 

        while(low < high){
            long mid = low + (high - low) / 2; 
            if(canRepair(ranks , cars , mid)){
                high = mid;  
            }else{
                low = mid + 1; 
            }
        }

        return low; 
    }

    private boolean canRepair(int[] ranks , int cars , long time){
        int totalCarsRepaired = 0; 

        for(int rank : ranks){
            totalCarsRepaired += Math.sqrt(time / rank); 
            if(totalCarsRepaired >= cars) return true; 
        }

        return false; 
    }
}