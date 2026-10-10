class Solution {
    public boolean isPalindrome(int x) {
        // Convert the integer to string
        String n = Integer.toString(x);
        
        // Initialize two pointers, one at the start and one at the end
        int start = 0;
        int end = n.length() - 1;

        // Compare the characters at the start and end
        while (start < end) {
            if (n.charAt(start) != n.charAt(end)) {
                return false;  // Return false if they don't match
            }
            start++;
            end--;
        }
        
        return true;  // Return true if all characters match
    }
}
