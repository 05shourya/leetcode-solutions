// Last updated: 4/11/2025, 6:49:01 PM
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>(); 
        backtrack(ans , new ArrayList<>() , candidates , target , 0); 
        return ans; 
        
    }

    public void backtrack(List<List<Integer>> ans , List<Integer> temp , int[] candidates, int remaining , int start){
        if(remaining == 0){
            ans.add(new ArrayList<>(temp)); 
            return; 
        }

        if(remaining < 0) return; 

        for(int i = start ; i < candidates.length ; i++){
            temp.add(candidates[i]); 
            backtrack(ans , temp , candidates , remaining - candidates[i] , i); 
            temp.remove(temp.size() - 1); 
        }
    }
}