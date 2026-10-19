class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        nums.sort()
        count = 1
        res = -1;
        for i in range(1, len(nums)):
            if i == len(nums):
                return nums[i]
            if nums[i] == nums[i-1]:
                count+=1
            else: 
                if count > len(nums)//2:
                    return nums[i-1]
                count = 1
        return nums[-1] 
        