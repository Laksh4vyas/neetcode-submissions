class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                   
                    for (int l = k + 1; l < n; l++) { 
                        
                        long sum = (long)nums[i] + nums[j] + nums[k] + nums[l]; 
                        
                        if (sum == target) {
                            
                            res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        }
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
}
