class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        n = len(nums) 
        h = n - 1
        l = 0 
        while l <= h:
            m = l + (h - l) // 2
            if nums[m] == target:
                return m 
            elif nums[m] < target:
                l = m + 1
            else:
                h = m - 1 
        return l
