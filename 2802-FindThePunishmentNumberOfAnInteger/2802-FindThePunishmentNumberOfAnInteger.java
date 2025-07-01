// Last updated: 7/1/2025, 11:04:04 PM
class Solution {
    public int punishmentNumber(int n) {
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            if (isValid(Integer.toString(square), 0, i)) {
                sum += square;
            }
        }
        
        return sum;
    }

    private boolean isValid(String s, int index, int target) {
        if (index == s.length()) {
            return target == 0;
        }
        
        int num = 0;
        for (int j = index; j < s.length(); j++) {
            num = num * 10 + (s.charAt(j) - '0');
            if (num > target) break; // Pruning
            if (isValid(s, j + 1, target - num)) return true;
        }
        
        return false;
    }
}
