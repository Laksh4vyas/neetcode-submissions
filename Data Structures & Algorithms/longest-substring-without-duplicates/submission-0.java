class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

    // Outer loop sets the starting point of the substring
    for (int i = 0; i < s.length(); i++) {
        HashSet<Character> visited = new HashSet<>();
        int currentLength = 0;

        // Inner loop expands the substring
        for (int j = i; j < s.length(); j++) {
            // If the character is already in our set, we hit a duplicate
            if (visited.contains(s.charAt(j))) {
                break; 
            }
            visited.add(s.charAt(j));
            currentLength++;
        }
        maxLength = Math.max(maxLength, currentLength);
    }
    return maxLength;

    }
}
