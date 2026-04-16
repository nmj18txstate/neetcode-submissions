class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Compare each element with every other element
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;  // Found duplicate!
                }
            }
        }
        return false;  // No duplicates found
    }
}