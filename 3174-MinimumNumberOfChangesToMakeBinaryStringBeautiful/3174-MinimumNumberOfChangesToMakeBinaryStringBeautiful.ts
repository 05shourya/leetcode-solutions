// Last updated: 7/1/2025, 11:03:41 PM
function minChanges(s: string): number {
    let index = 0 ; 
    let count = 0; 

    while (index < s.length){
        if(s[index + 1] !== s[index]){
            count++;
        }
        index += 2; 
    }
    return count; 
};