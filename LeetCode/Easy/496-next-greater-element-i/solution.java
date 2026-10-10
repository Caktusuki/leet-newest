import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {
            int target = nums1[i];
            int ng = -1;
            boolean targetFound = false;
            
            for (int num : nums2) {
                if (num == target) {
                    targetFound = true;
                } else if (targetFound) {
                    if (num > target) {
                        ng = num;
                        break;
                    }
                }
            }
            res[i] = ng;
        }
        return res;
    }
}
