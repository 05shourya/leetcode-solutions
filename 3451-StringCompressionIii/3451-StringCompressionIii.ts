// Last updated: 7/1/2025, 11:02:55 PM
function compressedString(word: string): string {
    let comp = "" ; 
    let charCount = 0; 
    let currChar = word[0]; 
    for(let i = 0 ; i < word.length ; i++){
        if(currChar == word[i] && charCount < 9){
            charCount++; 
        }else{
            comp += `${charCount}${currChar}`
            charCount = 1; 
            currChar = word[i]; 
        }
    }
    comp += `${charCount}${currChar}`; 
    return comp; 
};