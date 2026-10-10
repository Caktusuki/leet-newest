class Solution {
    public int missingNumber(int[] nums) {
        int a=0;
        a=a^nums.length;
        for(int i=0;i<nums.length;i++ ){
            a=a^i^nums[i];
        }
        return a;
    }
}
