# Last updated: 7/1/2025, 11:03:19 PM
class Solution:
    def minimumPushes(self, word: str) -> int:
        counter = [0] * 26
        minimum_press = 0
        for i in word: 
            counter[ord(i) - ord("a")] += 1
        
        counter.sort(reverse=True)
        for i in range(26): 
            minimum_press += counter[i] * (int(i/8) + 1) 
        return minimum_press

        