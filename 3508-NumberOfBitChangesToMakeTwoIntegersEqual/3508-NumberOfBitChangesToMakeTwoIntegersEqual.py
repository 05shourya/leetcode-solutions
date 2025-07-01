# Last updated: 7/1/2025, 11:02:47 PM
class Solution:
    def minChanges(self, n: int, k: int) -> int:
        bin1 = bin(n)[2:]
        bin2 = bin(k)[2:]

        max_len = max(len(bin1) , len(bin2))

        bin1 = bin1.zfill(max_len)
        bin2 = bin2.zfill(max_len)
        count = 0
        for i in range(max_len): 
            print(bin1[i] , bin2[i])
            if(bin2[i] == '1' and bin1[i] == '0'): 
                return -1
            elif(bin1[i] == '1' and bin2[i] == '0'): 
                count += 1
        return count
        