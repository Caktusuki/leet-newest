class Solution {
    public int[][] merge(int[][] in) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(in, (a, b) -> a[0] - b[0]);
        int curS = in[0][0];  
        int curE = in[0][1];  
        for(int i = 1; i < in.length; i++) {
            if(curE < in[i][0]) {
                ans.add(new ArrayList<>(Arrays.asList(curS, curE)));
                curS = in[i][0];
                curE = in[i][1];
            }
            else {
                curS = Math.min(curS, in[i][0]); 
                curE = Math.max(curE, in[i][1]);
            }
        }
        ans.add(new ArrayList<>(Arrays.asList(curS, curE)));
        int[][] fina = new int[ans.size()][2];

        for(int i = 0; i < ans.size(); i++) {
            fina[i][0] = ans.get(i).get(0);
            fina[i][1] = ans.get(i).get(1);
        }

        return fina;
    }
}
