class Solution {
    public int minAddToMakeValid(String s) {
        int c =0, res=0;
        for(int ch : s.toCharArray()){
            if(ch=='('){
                c++;
            }else if(c>0){
                c--;
            }else{
                res++;
            }
        }
        return res+c;
    }
}
