class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    // 1. FIXED: Incremented l++ instead of i++
                    for (int l = k + 1; l < n; l++) { 
                        
                        // 2. FIXED: Cast to long to prevent integer overflow
                        long sum = (long)nums[i] + nums[j] + nums[k] + nums[l]; 
                        
                        if (sum == target) {
                            // 3. FIXED: Replaced duplicate nums[l] with nums[k]
                            res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        }
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
}
