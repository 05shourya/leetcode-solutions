class Solution {
    private boolean isPrime(int n){
        if(n == 2 || n == 3){
            return true; 
        }

        if(n == 1 || n % 2 == 0){
            return false; 
        }

        for(int i = 3 ; i <= Math.sqrt(n) ; i += 2){
            if(n % i == 0){
                return false; 
            }
        }

        return true; 
    }
    
    public int[] closestPrimes(int left, int right) {
        List<Integer> primes = new ArrayList<>(); 
        int res[] = new int[2]; 
        
        for(int i = left; i <= right ; i++ ){
            if(isPrime(i)){
                primes.add(i); 
            }
        }

        int min = Integer.MAX_VALUE;
        if(primes.size() < 2){
            return new int[]{-1 ,-1}; 
        } 
        for(int i = 1 ; i < primes.size(); i++){
            if(primes.get(i) - primes.get(i -1) < min){
                res[0] = primes.get(i-1); 
                res[1] = primes.get(i); 
                min = primes.get(i) - primes.get(i - 1); 
            }
        }

        return res; 
    }
}