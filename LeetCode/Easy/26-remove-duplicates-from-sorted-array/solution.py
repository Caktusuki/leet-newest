class Solution(object):
    def removeDuplicates(self, nums):
        if not nums:
            return 0       
        # Initialize the slow pointer (k)
        # We start at 1 because the first element (index 0) is always unique.
        k = 1
        # Iterate with the fast pointer (i) starting from index 1
        for i in range(1, len(nums)):
            # If the current element is different from the previous one, it is unique
            if nums[i] != nums[i-1]:
                nums[k] = nums[i] # Move the unique element to the 'k' position
                k += 1            # Increment the position for the next unique element
                       
        # k represents the number of unique elements
        return k
