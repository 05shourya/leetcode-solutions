# Last updated: 7/1/2025, 11:03:43 PM
class Solution:
    def minChanges(self, s: str) -> int:
        index = 0 
        count = 0; 


        while (index < len(s) -1):
            if(s[index + 1] != s[index]):
                count +=1
            index += 2

        return count; 