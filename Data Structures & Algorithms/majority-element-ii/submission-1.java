class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> counts = new HashMap<>();
        for(int num : nums){
            counts.put(num , counts.getOrDefault(num, 0)  + 1);
            if(counts.get(num) == (n / 3) + 1){
                result.add(num);
            }
        }
        return result;
    }
}