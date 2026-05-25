class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        String str1 = str.replaceAll("[^a-zA-Z0-9]","");
        char[] arr = str1.toCharArray();
        int n = str1.length();
        int left = 0;
        int right = n-1;
        boolean isPalindrome = true;
        while(left <= right){
            if(arr[left] != arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
