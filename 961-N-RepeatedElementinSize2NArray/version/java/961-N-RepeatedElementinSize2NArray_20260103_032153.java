// Last updated: 1/3/2026, 3:21:53 AM
1class Solution {
2    public int repeatedNTimes(int[] A) {
3        for (int i = 0; i < A.length - 2; i++)
4            if (A[i] == A[i + 1] || A[i] == A[i + 2])
5                return A[i];
6        return A[A.length - 1];
7    }
8}
9