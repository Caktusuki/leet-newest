class Solution {
    public int scoreOfParentheses(String s) {
        int S=0,depth=0;
        for(int i=0;i<s.length();++i){
            //left to right
            if(s.charAt(i)=='('){
                ++depth;
            }
            else{
                --depth;
          
            //now right to left
             if(s.charAt(i-1)=='('){
                 S+=1 << depth;
             }
            }
        }
        return S;
    }
}
