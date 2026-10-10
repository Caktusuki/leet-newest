class Solution {
    public int maxSubArray(int[] nums) {
        int mxSum = Integer.MIN_VALUE;
        int cSum = 0;

        for (int i = 0; i < nums.length; i++) {
            cSum += nums[i];

            if (cSum > mxSum) {
                mxSum = cSum;
            }

            if (cSum < 0) {
                cSum = 0;
            }
        }

        return mxSum;
    }
}
