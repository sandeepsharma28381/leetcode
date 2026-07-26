class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        n = sorted(nums)
        s = len(n)
        return n[s//2]
            
        