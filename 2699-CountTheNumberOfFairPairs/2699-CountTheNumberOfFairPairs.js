// Last updated: 7/1/2025, 11:04:30 PM
/**
 * @param {number[]} nums
 * @param {number} lower
 * @param {number} upper
 * @return {number}
 */
var countFairPairs = function(nums, lower, upper) {
  nums.sort((a,b) => a -b); 
  function countPairs(target){
    let [left , right , count] = [0 , nums.length - 1 , 0];

    while(left < right){
        const sum = nums[left] + nums[right]; 

        if(sum <= target ){
            count += (right - left); 
            left++; 
        }else{
            right--; 
        }
    }
    return count;  
  }

  let upperCount = countPairs(upper); 
  let lowerCount = countPairs(lower -1); 

  return upperCount - lowerCount; 
};