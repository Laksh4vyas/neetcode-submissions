class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        int currSum = 0;
        Map<Integer,Integer> set = new HashMap<>();
        set.put(0,1);
        for(int num : nums){
        currSum = currSum + num;
        int diff = currSum - k;
        res = res + set.getOrDefault(diff , 0);
        set.put(currSum, set.getOrDefault(currSum, 0) + 1);
        }
        return res;
    }
}