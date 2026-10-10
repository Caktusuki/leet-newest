public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        long prev = 1;
        for (int k = 1; k <= rowIndex; k++) {
            long nxt_val = prev * (rowIndex - k + 1) / k;
            res.add((int) nxt_val);
            prev = nxt_val;
        }
        return res;
    }
}
