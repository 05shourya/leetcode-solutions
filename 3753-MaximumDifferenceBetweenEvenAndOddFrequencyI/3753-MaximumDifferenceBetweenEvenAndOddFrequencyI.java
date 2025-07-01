// Last updated: 7/1/2025, 11:02:09 PM
class Solution {
    public int maxDifference(String s) {
        int res = 0; 
        Map<Character, Integer> map = new HashMap<>(); 
        for(char c : s.toCharArray()){
            map.put(c , map.getOrDefault(c , 0) + 1); 
        }
        int a1 = Integer.MIN_VALUE , 
        a2 = Integer.MAX_VALUE; 
        for(char c : map.keySet()){
            if(map.get(c) % 2 == 0){
                a2 = Math.min(a2 , map.get(c)); 
            }else {
                a1 = Math.max(a1 , map.get(c)); 
            }
        }
        res = a1 - a2; 
        return res; 
    }
}