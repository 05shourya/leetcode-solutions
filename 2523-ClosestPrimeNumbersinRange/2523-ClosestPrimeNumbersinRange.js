/**
 * @param {number} left
 * @param {number} right
 * @return {number[]}
 */

const isPrime = (n) => {
    if (n < 2) {
        return false;
    }

    if (n === 2) {
        return true; 
    }

    if (n % 2 === 0) {
        return false; 
    }

    for (let i = 3; i <= Math.sqrt(n); i += 2) {
        if (n % i === 0) {
            return false;
        }
    }
    return true;
}
 
var closestPrimes = function(left, right) {
    let n1, n2;
    let min = Number.MAX_SAFE_INTEGER;
    let res = [-1, -1]; 
    
    for (let i = left; i <= right; i++) {
        if (isPrime(i)) {
            if (n1 === undefined) {
                n1 = i;
            } else if (n2 === undefined) {
                n2 = i;
                min = n2 - n1;
                res = [n1, n2];
            } else {
                if (i - n2 < min) {
                    min = i - n2;
                    res = [n2, i];
                }
                n1 = n2;
                n2 = i;
            }
        }
    }
    
    return res;
};
