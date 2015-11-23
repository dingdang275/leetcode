import java.util.*;

public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k < 1 || t < 0) return false;
 
    TreeSet<Integer> set = new TreeSet<Integer>();
 
    for (int i = 0; i < nums.length; i++) {
        int c = nums[i];
        if ((set.floor(c) != null && c <= set.floor(c) + t)
        || (set.ceiling(c) != null && c >= set.ceiling(c) -t))
            return true;
 
        set.add(c);
 
        if (i >= k)
            set.remove(nums[i - k]);
    }
 
    return false;
}

    public static void main(String[] args){
    	int[] nums = new int[]{2, 15, 5, 10, 8, 20, 4, 7};
        Solution a = new Solution();

    	boolean result = a.containsNearbyAlmostDuplicate(nums, 3, 10);
    }
}