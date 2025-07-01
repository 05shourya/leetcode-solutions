// Last updated: 7/1/2025, 11:03:29 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>(); 
        for(int i = 0 ; i < words.length ; i++){
            if(isCharPresent(words[i] , x)){
                ans.add(i); 
            }
        }
        return ans; 
    }

    private boolean isCharPresent(String word , char x){
        for(int i = 0 ; i < word.length() ; i++){
            if(word.charAt(i) == x){
                return true; 
            }
        }
        return false;
    }
}