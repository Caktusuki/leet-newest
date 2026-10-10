class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        # Initialize a pointer 'k' to track the position of valid elements
        k = 0
        
        # Iterate through every element in the array
        for i in range(len(nums)):
            # If the current element is NOT the value we want to remove...
            if nums[i] != val:
                # ...move it to the 'k' position
                nums[k] = nums[i]
                # Increment 'k' to prepare for the next valid element
                k += 1
                
        # 'k' is now the count of valid elements
        return k
