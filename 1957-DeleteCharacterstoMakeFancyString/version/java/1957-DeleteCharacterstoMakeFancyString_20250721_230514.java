// Last updated: 7/21/2025, 11:05:14 PM
class Solution {
    public String makeFancyString(String s) {
        int count = 0; 
        StringBuilder sb = new StringBuilder(); 
        sb.append(s.charAt(0)); 

        for(int i = 1 ; i < s.length() ; i++){
            if(s.charAt(i) == s.charAt(i - 1)){
                count++; 
            }else{
                count = 0; 
            }
            if(count < 2){
                sb.append(s.charAt(i)); 
            }
        }

        return sb.toString(); 
        
        
    }
}