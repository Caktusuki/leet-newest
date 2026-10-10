class Solution {
    public int addDigits(int n) {
        //stop if there is one digit less complexity
        while (n >= 10) {
            int res = 0;
            while (n > 0) {
                res += n % 10;
                n /= 10;
            }
            n = res;
        }
        return n;
    }
}
