// Last updated: 7/1/2025, 11:03:03 PM
class Solution {
    public int minimumOperationsToMakeKPeriodic(String word, int k) {
        Map<String, Integer> map = new HashMap<>(); 
        int max = 0; 
        
        for(int i = 0 ; i < word.length() ; i += k){
            String sub = word.substring(i , i + k); 
            map.put(sub , map.getOrDefault(sub, 0) + 1);
            max = Math.max(max, map.get(sub));  
        }

        return (word.length() / k) - max; 
        
    }
}