class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Handle empty string case
        if (s == null || s.length() == 0) return 0;

        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0; // Left pointer of the window

        // Right pointer expands the window
        for (int right = 0; right < s.length(); right++) {
            // If character repeats, shrink window from the left
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            // Add current character and update max length
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}