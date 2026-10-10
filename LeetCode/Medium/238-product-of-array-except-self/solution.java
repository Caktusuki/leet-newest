class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixps = new int[n], prefixpe = new int[n], res = new int[n];
        prefixps[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixps[i] = prefixps[i - 1] * nums[i];
        }
        prefixpe[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            prefixpe[i] = prefixpe[i +1] * nums[i];
        }
        res[0] = prefixpe[1];
        res[n - 1] = prefixps[n - 2];
        for (int i = 1; i < n-1; i++) {
            res[i] = prefixps[i - 1] * prefixpe[i + 1];
        }
        return res;
    }
}
