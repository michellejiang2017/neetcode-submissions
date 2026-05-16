class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        duplicate = False 
        for i in range (0, len(nums)): 
            for j in range (i+1, len(nums)): 
                if nums[i] == nums[j]: 
                    duplicate = True
        return duplicate 