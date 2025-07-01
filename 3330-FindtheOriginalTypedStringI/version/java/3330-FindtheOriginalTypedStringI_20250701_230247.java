// Last updated: 7/1/2025, 11:02:47 PM
class Solution {
    public int possibleStringCount(String word) {
        if(word.length() == 1){
            return 1; 
        }
        int res = 1; 

        for(int i = 1 ; i < word.length(); i++){
            if(word.charAt(i) == word.charAt(i - 1)){
                res++; 
            }

        }

        return res; 
    }
}