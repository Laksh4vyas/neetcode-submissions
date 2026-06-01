class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for(int i=0;i<s.length();i++){
            HashSet<Character> visited = new HashSet<>();
            int currLength = 0;
            for(int j = i;j<s.length();j++){
                if(visited.contains(s.charAt(j))){
                    break;
                }
                visited.add(s.charAt(j));
                currLength++;
            }
            maxLength = Math.max(currLength, maxLength);
        }
        return maxLength;
    }
}