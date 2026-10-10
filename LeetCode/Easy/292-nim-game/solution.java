class Solution {
    public boolean canWinNim(int n) {
        for(int i=0;i<n;i++){
            if(n%4!=0){
                return true;
            }
            else{
             return false;
            }
        }
        return false;
    }
}
