class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int target = 1; target <= n ; target++){
            boolean isFound = false;
        
        for(int i=0;i<n;i++){
            if(nums[i] == target){
                isFound = true;
                break;
        }
        }
        if(!isFound){
            return target;
        }
    }
        return n+1;
    }
}