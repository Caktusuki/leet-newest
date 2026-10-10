class Solution {
    public int majorityElement(int[] nums) {
        //   Arrays.sort(nums);
        //   int n=nums.length;
        //   return nums[n/2];
        int max = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                count++;
                max = nums[i];
            } else if (max == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return max;
    }
}
