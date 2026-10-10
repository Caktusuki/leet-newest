class Solution {
    public int totalNumbers(int[] d) {
        HashSet<Integer> unique = new HashSet<>();
        int l = d.length;
        //1
        for (int onei = 0; onei < l; ++onei) {
            if (d[onei] % 2 == 1) {
                continue;
            }

            //10s
            for (int teni = 0; teni < l; ++teni) {
                if (teni == onei) {
                    continue;
                }
                for (int huni = 0; huni < l; ++huni) {
                    if (d[huni] == 0 ||
                            huni == teni ||
                            huni == onei) {
                        continue;
                    }
                    //digit
                    int digit = d[huni] * 100 + d[teni] * 10 + d[onei];
                    unique.add(digit);
                }

            }
        }
        return unique.size();
    }

}
