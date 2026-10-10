class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int[] res = new int[] { -1, -1 };
        long maxp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++)
                if (nums[i] + nums[j] == target && nums[i] != nums[j]) {
                    long rtn = (long) nums[i] * nums[j];
                    if (res[0] == -1 || rtn > maxp) {
                        maxp = rtn;
                        if (nums[i] > nums[j]) {
                            res[0] = i;
                            res[1] = j;
                        } else {
                            res[1] = i;
                            res[0] = j;
                        }
                    }
                }
        }
        return res;
    }
}
