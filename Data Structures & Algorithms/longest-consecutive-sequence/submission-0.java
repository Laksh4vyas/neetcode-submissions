class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int count = 1;
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            int prev = nums[i] - 1;
            if (nums[i - 1] == prev) {
                count++;
            }
            else if (nums[i] == nums[i - 1]) {
                continue;   
            }
            else {
                max = Math.max(max, count);
                count = 1;
            }
        }
        
        return Math.max(max, count);
    }
}