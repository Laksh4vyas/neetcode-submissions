class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        boolean[] visited = new boolean[n];
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < n ; i++){
            if(visited[i]) continue;
            int count = 1;
            for(int j = i+1 ; j < n ; j++){
                if(nums[i] == nums[j]){
                    visited[j] = true;
                    count++;
                }
            }
        System.out.println(nums[i] +  count);   
        if(count > n/3){
            result.add(nums[i]);
        }
        }

        return result;
    }
}