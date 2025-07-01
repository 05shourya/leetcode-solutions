# Last updated: 7/1/2025, 11:02:10 PM
class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        numsSum = sum(nums)
        return numsSum%k