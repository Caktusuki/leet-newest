class Solution {
    public int smallestIndex(int[] n) {
        for(int i=0 ;i<n.length;i++){
           int a=n[i];
           int s=0;
           while (a>0){
            s+=a%10;
            a/=10;
           }
           if(s==i){
            return i;
           }
        }
        return -1;
    }
}
