// Last updated: 11/22/2025, 12:18:21 AM
class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int[] first = new int[26];
        int[] last = new int[26];
        
        for (int i = 0; i < 26; i++) {
            first[i] = -1;
            last[i] = -1;
        }
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (first[c - 'a'] == -1) {
                first[c - 'a'] = i;
            }
            last[c - 'a'] = i;
        }
        
        HashSet<String> uniquePalindromes = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            char middle = s.charAt(i);
            for (int j = 0; j < 26; j++) {
                if (first[j] != -1 && first[j] < i && last[j] > i) {
                    uniquePalindromes.add("" + (char) (j + 'a') + middle + (char) (j + 'a'));
                }
            }
        }
        
        return uniquePalindromes.size();
    }
}