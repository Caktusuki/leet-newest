import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newStr =new StringBuilder();
        for(char i:s.toCharArray()){
            if(Character.isLetterOrDigit(i)){
                newStr.append(Character.toLowerCase(i));
            }
        }
        int str=0, end= newStr.length()-1;
        while(str<end){
            if(newStr.charAt(str++) != newStr.charAt(end--)){
                return false;
            }
            
        }
        return true;

    }
}
