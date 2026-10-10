class Solution {
    public int minimumSum(int num) {
        int[]  d =new int[4];
        //taking an arr of digit
        int curr=0;
        while(num>0){
            //getting digits
            d[curr++]=num%10;
            num/=10;
        }
        Arrays.sort(d);//to make it in order
        int num1= d[0]*10+d[2];//1st and 2nd Digit
        int num2=d[1]*10+d[3];//2nd and 3rd Digit
        return num1+num2;
    }
}
