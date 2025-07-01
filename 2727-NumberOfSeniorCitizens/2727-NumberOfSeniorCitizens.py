# Last updated: 7/1/2025, 11:04:16 PM
class Solution:
    def countSeniors(self, details: List[str]) -> int:
        count = 0 ;
        for i in details: 
            if(int(i[11:13]) > 60):
                count += 1
        return count