// Last updated: 7/1/2025, 11:03:38 PM
/**
 * @param {string} s
 * @return {number}
 */
var minChanges = function(s) {

    let index = 0; 
    let count = 0; 

    while(index < s.length){
        if(s[index] !== s[index + 1]){
            count++; 
        }
        index += 2;  
    }
    return count; 
    
};