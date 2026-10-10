class Solution {
    public int[] leftRightDifference(int[] nums) {
        int l =nums.length;
        int rightS=0;

        for(int n :nums){
            rightS+=n;
        }
        int leftS=0;

        int[] ans=new int[l];
        for(int i =0;i<l;i++){
            rightS-=nums[i];
            ans[i]=Math.abs(leftS-rightS);
            leftS+=nums[i];
        }
        return ans;
    }
}
