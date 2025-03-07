class Solution {
    private boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int[] closestPrimes(int left, int right) {
        int n1 = -1, n2 = -1;
        int min = Integer.MAX_VALUE;
        int[] res = {-1, -1};

        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                if (n1 == -1) {
                    n1 = i;
                } else if (n2 == -1) {
                    n2 = i;
                    min = n2 - n1;
                    res[0] = n1;
                    res[1] = n2;
                } else {
                    if (i - n2 < min) {
                        min = i - n2;
                        res[0] = n2;
                        res[1] = i;
                    }
                    n1 = n2;
                    n2 = i;
                }
            }
        }

        return res;
    }
}
