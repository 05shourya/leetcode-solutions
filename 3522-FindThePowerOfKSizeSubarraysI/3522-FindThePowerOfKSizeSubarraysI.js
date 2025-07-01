// Last updated: 7/1/2025, 11:02:44 PM
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var resultsArray = function(nums, k) {
    const res = []; 
    let currLen = 0; 
    function getKthSorted(pos){
        for(i = pos ; i < pos + k ; i++){
            if( i === pos) continue
            if(nums[i] - nums[i - 1] !== 1){
                return -1; 
            }
        }
        return nums[pos + k -1]; 
    }

    for(let i = 0 ; i <= nums.length - k; i++){
        res.push(getKthSorted(i)); 
    }
    return res; 
};