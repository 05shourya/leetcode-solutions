// Last updated: 4/11/2025, 1:13:04 PM
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0; 
        
        for(int i = low ; i <= high ; i++){
            if(isSymmetric(i)){
                count++; 
            }
        }

        return count; 
    }

    boolean isSymmetric(int num) {
        String s = String.valueOf(num);
        int len = s.length();
        if (len % 2 != 0) return false;

        int half = len / 2;
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < half; i++) {
            sum1 += s.charAt(i) - '0';
            sum2 += s.charAt(i + half) - '0';
        }

        return sum1 == sum2;
    }
}