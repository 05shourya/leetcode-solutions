// Last updated: 7/1/2025, 11:04:08 PM
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int n = derived.length;

        if (canFormOriginal(derived, 0)) {
            return true;
        }

        if (canFormOriginal(derived, 1)) {
            return true;
        }

        return false;
    }

        private boolean canFormOriginal(int[] derived, int firstValue) {
        int n = derived.length;
        int[] original = new int[n];
        original[0] = firstValue;

        for (int i = 1; i < n; i++) {
            original[i] = original[i - 1] ^ derived[i - 1];
        }

        return (original[n - 1] ^ original[0]) == derived[n - 1];
    }
}