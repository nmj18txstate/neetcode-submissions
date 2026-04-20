// Character Frequency Counting approach
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            // Count character frequencies
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            
            // Use frequency array as key
            String key = Arrays.toString(count);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
}
/* Sorting O(n * k log k) O(nk) Simpler, easier to understand Frequency O(n * k) O(nk) Slightly faster, no sorting needed
where n = number of strings, k = average string length */