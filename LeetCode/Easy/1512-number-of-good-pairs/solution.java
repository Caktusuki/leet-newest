class Solution {
    public int numIdenticalPairs(int[] nums) {
        int r=0, count [] =new int[101];
        for (int n:nums){
            r+=count[n]++;
        }
        return r;
    }
}
