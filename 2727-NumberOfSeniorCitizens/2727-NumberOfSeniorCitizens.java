// Last updated: 7/1/2025, 11:04:22 PM
class Solution {
    public int countSeniors(String[] details) {
        int count = 0 ; 
        for(int i = 0 ; i < details.length ; i++){
            if(Integer.parseInt(details[i].substring(11 , 13)) > 60){
                count++; 
            }
        }
        return count; 
    }
}