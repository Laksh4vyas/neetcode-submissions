class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        if(m > n ){
            return false;
        }
        char[] s1Array = s1.toCharArray();
        Arrays.sort(s1Array);
        for(int i = 0; i <= n-m ;i++){
            String sub = s2.substring(i,i+m);
            char[] subArray = sub.toCharArray();
            Arrays.sort(subArray);
            if(Arrays.equals(s1Array, subArray)){
                return true;
            }
        }
        return false;
    }
}
