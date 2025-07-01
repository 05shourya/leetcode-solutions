# Last updated: 7/1/2025, 11:04:02 PM
class Solution:
    def rotate_left_by_one(self, arr: List[int]):
        first = arr[0]
        for i in range(1, len(arr)):
            arr[i - 1] = arr[i]
        arr[-1] = first

    def minCost(self, nums: List[int], x: int) -> int:
        min_cost = nums[:]
        ans = float('inf')
        sum_val = 0

        for i in range(len(nums)):
            sum_val = 0
            if i != 0:
                self.rotate_left_by_one(nums)
            for j in range(len(nums)):
                min_cost[j] = min(nums[j], min_cost[j])
                sum_val += min_cost[j]
            ans = min(ans, sum_val + (i * x))

        return ans
