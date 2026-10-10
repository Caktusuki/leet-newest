import java.util.*;
class Solution {
    public int maximumWealth(int[][] acc) {
        int max=0;
        for(int[] i:acc){
            int amt=0;
            for (int m:i){
                amt+=m;
            }
            max=Math.max(amt,max);
        }
        return max;
    }
}
