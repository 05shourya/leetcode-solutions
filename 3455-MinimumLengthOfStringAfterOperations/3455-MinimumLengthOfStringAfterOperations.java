// Last updated: 7/1/2025, 11:02:54 PM
class Solution {
    public int minimumLength(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int n = s.length();
        boolean[] removed = new boolean[n];
        int minLength = n;

        for (int i = 1; i < n - 1; i++) {
            char current = s.charAt(i);
            
            if (removed[i]) continue;

            int left = i - 1;
            int right = i + 1;

            while (left >= 0 && (removed[left] || s.charAt(left) != current)) left--;
            while (right < n && (removed[right] || s.charAt(right) != current)) right++;

            if (left >= 0 && right < n && s.charAt(left) == current && s.charAt(right) == current) {
                removed[left] = true;
                removed[right] = true;
                minLength -= 2;  
            }
        }

        return minLength;
    }
}