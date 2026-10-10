import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Create a checklist to store numbers we've seen
        HashSet<Integer> seen = new HashSet<>();
        for (int x : nums) {
            // seen.add(x) tries to put the number in the set.
            // If it's ALREADY there, it returns false. 
            // So !seen.add(x) means "If we failed to add it because it's a duplicate"
            if (!seen.add(x)) {
                return true; 
            }
        }
        return false;
    }
}
