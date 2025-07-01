// Last updated: 7/1/2025, 11:02:31 PM
class Solution {
    private static final int MOD = 1_000_000_007;

    public int lengthAfterTransformations(String s, int t, List<Integer> nums) {
        int[][] mat = new int[26][26];

        // Build the transformation matrix
        for (int i = 0; i < 26; i++) {
            int count = nums.get(i);
            for (int j = 0; j < count; j++) {
                mat[i][(i + 1 + j) % 26]++;
            }
        }

        // Exponentiate the matrix to the power t
        int[][] trans = matrixPower(mat, t);

        // Count initial frequency of each letter in the input string
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Multiply initial frequencies by transformation matrix
        long result = 0;
        for (int i = 0; i < 26; i++) {
            long sum = 0;
            for (int j = 0; j < 26; j++) {
                sum = (sum + 1L * freq[j] * trans[j][i]) % MOD;
            }
            result = (result + sum) % MOD;
        }

        return (int) result;
    }

    private int[][] matrixPower(int[][] mat, int power) {
        int[][] result = new int[26][26];
        // Identity matrix
        for (int i = 0; i < 26; i++) {
            result[i][i] = 1;
        }

        while (power > 0) {
            if ((power & 1) == 1) {
                result = multiply(result, mat);
            }
            mat = multiply(mat, mat);
            power >>= 1;
        }

        return result;
    }

    private int[][] multiply(int[][] A, int[][] B) {
        int[][] res = new int[26][26];
        for (int i = 0; i < 26; i++) {
            for (int k = 0; k < 26; k++) {
                if (A[i][k] == 0) continue;
                for (int j = 0; j < 26; j++) {
                    res[i][j] = (int) ((res[i][j] + 1L * A[i][k] * B[k][j]) % MOD);
                }
            }
        }
        return res;
    }
}
