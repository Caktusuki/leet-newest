class Solution {
    public int sumOfEncryptedInt(int[] nums) {
    int sum =0;
        for(int num:nums ){
            sum+=encrypt(num);
        }
        return sum;
    }
    private int encrypt(int x){
        int maxD=0;
        int placeValue=0;
        while(x>0){
            int current =x%10;
            maxD=Math.max(maxD,current);
            placeValue=placeValue *10+1; //111
            x=x/10;
        }
        return maxD*placeValue;
    }
}
