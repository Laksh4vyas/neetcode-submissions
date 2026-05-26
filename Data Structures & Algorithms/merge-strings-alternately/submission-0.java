class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int n = word1.length();
        int m = word2.length();
        int left = 0;
        int right = 0;
        while(left < n  || right < m){
            if(left < n){
                res.append(word1.charAt(left));
                left++;
            }
            if(right < m){
                res.append(word2.charAt(right));
                right++;
            }
        }
        return res.toString();
    }
}