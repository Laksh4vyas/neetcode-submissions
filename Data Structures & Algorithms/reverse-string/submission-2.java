class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        Stack<Character> stack = new Stack<>();
        for(char c : s){
            stack.push(c);
        }
        int i=0;
        while(!stack.isEmpty()){
            s[i] =  stack.pop();
            i++;
        }
    }
}