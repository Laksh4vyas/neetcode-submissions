class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for(int a  : asteroids){
            boolean destroyed = false;
            while(!s.isEmpty() && a < 0 && s.peek() > 0){
                int num1 = Math.abs(a);
                int num2 = s.peek();
                if(num1 < num2){
                    destroyed = true;
                    break;
                }
                else if(num1 == num2){
                    s.pop();
                    destroyed = true;
                    break;
                }
                else{
                    s.pop();
                }
            }
            if(!destroyed){
                s.push(a);
            }
        }
        int[] result = new int[s.size()];
        for(int i=result.length-1;i>=0;i--){
            result[i] = s.pop();
        }
        return result;
    }
}