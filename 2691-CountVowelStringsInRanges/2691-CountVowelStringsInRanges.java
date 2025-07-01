// Last updated: 7/1/2025, 11:04:26 PM
class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] prefixSum = new int[words.length + 1]; 
        prefixSum[0] = 0;
        for(int i = 1 ; i <= words.length ; i++){
            if(isStartingAndEndingWithVowel(words[i - 1])){
                prefixSum[i] = prefixSum[i - 1] + 1; 
            }else{
                prefixSum[i] = prefixSum[i -1]; 
            }
        }

        int ans[] = new int[queries.length]; 

        for(int i = 0 ; i < queries.length ; i++){
            ans[i] = prefixSum[queries[i][1] + 1] - prefixSum[queries[i][0]]; 
        }

        return ans; 

        
    }

    private boolean isStartingAndEndingWithVowel(String str){
        if(isVowel(str.charAt(0)) && isVowel(str.charAt(str.length() - 1))) return true; 
        return false; 
    }
    
    private boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true; 
        return false; 
    }
}