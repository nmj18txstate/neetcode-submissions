class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> seen = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            seen.put(s.charAt(i), seen.getOrDefault(s.charAt(i), 0) + 1);
            seen.put(t.charAt(i), seen.getOrDefault(t.charAt(i), 0) - 1);
        }
        for (int val : seen.values()) {
            if (val != 0) return false;
        }
        return true;
    }
}