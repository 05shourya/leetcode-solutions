// Last updated: 9/24/2025, 12:07:32 AM
class Solution {
    public char findTheDifference(String s, String t) {
        int[] count = new int[26]; 
        
        for(char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        
        for(char c : t.toCharArray()) {
            if(--count[c - 'a'] < 0) {
                return c; 
            }
        }
        
        return ' '; 
    }
}
