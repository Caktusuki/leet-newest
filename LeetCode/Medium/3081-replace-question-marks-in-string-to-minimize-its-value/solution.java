class Solution {
    public String minimizeStringValue(String s) {
        int[] count=new int[26];
        int questionMark=0;
        char[] a=s.toCharArray();
        for(int ch: a){
            if(ch =='?'){
                questionMark++;
            }
            else{
                count[ch -'a']++;
            }
        }
        char [] replacement =new char[questionMark];
        for(int i =0; i<questionMark;i++){
            int bestplace=0;
            for(int j=1;j<26;j++){
                if(count[j]<count[bestplace]){
                    bestplace=j;
                }
            }
            replacement[i]=(char)('a'+bestplace);
            count[bestplace]++;
        }
        Arrays.sort(replacement);
        int replace=0;
        for(int i =0;i<a.length;i++){
            if(a[i]=='?'){
                a[i]=replacement[replace++];
            }
        }
        return new String(a);
    }

}
