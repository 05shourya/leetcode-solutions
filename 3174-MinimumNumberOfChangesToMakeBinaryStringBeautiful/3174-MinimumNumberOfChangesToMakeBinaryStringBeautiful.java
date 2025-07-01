// Last updated: 7/1/2025, 11:03:33 PM
class Solution {
    public int minChanges(String s) {
        int index = 0 ; 
        int count = 0; 

        while(index < s.length() -1 ){
            if(s.charAt(index) != s.charAt(index + 1)){
                count++; 
            }
            index += 2; 
        }

        return count; 
    }
}