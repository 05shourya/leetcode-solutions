// Last updated: 10/23/2025, 2:03:53 PM
class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder sb = new StringBuilder(s); 

        while(sb.length() > 2){
            sb = helper(sb.toString()); 
        }

        return sb.charAt(0) == sb.charAt(1); 
    }

    private StringBuilder helper(String s){
        int n = s.length(); 
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < n - 1; i++){
            int a = s.charAt(i) - '0'; 
            int b = s.charAt(i + 1) - '0'; 

            sb.append((a + b) % 10); 
        }
        
        return sb; 
    }
    
}