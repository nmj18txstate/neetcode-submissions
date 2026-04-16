class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Create a HashSet to store numbers we've seen
        Set<Integer> seen = new HashSet<>();
        
        // Loop through each number in the array
        for (int i = 0; i < nums.length; i++) {
            // Check if we've seen this number before
            if (seen.contains(nums[i])) {
                return true;  // Found a duplicate!
            }
            // Add the number to our "seen" set
            seen.add(nums[i]);
        }
        
        // If we finish the loop without finding duplicates
        return false;
    }
}