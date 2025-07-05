// Last updated: 7/6/2025, 12:34:33 AM
class Solution {
    public char kthCharacter(int k) {
        return (char)('a' + Integer.bitCount(k - 1));
    }
}