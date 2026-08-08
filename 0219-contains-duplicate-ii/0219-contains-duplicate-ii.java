import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> seen = new HashMap<>(); 
        
        for (int i = 0; i < nums.length; i++) {
            // Check if element was seen before and distance is <= k
            if (seen.containsKey(nums[i]) && i - seen.get(nums[i]) <= k) {
                return true;
            }
            // Always update to the latest index of nums[i]
            seen.put(nums[i], i);
        }
        
        return false;
    }
}
