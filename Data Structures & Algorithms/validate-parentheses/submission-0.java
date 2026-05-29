class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char op : s.toCharArray()){
            if(op == '{' || op == '(' || op == '['){
                st.push(op);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();
                if  ((op == ')') && top != '('  ||
                     (op == ']') && top != '['  || 
                     (op == '}') && top != '{') {
                        return false;
                    }
            }
        }
        return st.isEmpty();
    }
}
