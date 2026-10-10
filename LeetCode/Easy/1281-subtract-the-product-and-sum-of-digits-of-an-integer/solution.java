class Solution {
    public int subtractProductAndSum(int n) {
        int m = 1, sum=0;
        while(n !=0){
            int digit =n%10;
            m*=digit;
            sum+=digit;
            n/=10;
        }
        return m-sum;
    }
}
