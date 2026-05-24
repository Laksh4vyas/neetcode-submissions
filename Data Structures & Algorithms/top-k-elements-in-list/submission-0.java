class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        int n = nums.length;

        int[] freq = new int[n];

        // Count frequency
        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {

                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            freq[i] = count;
        }

        int[] result = new int[k];

        boolean[] used = new boolean[n];

        // Find top k frequent
        for (int x = 0; x < k; x++) {

            int maxFreq = -1;
            int index = -1;

            for (int i = 0; i < n; i++) {

                if (!used[i] && freq[i] > maxFreq) {
                    maxFreq = freq[i];
                    index = i;
                }
            }

            result[x] = nums[index];

            // Mark all duplicates as used
            for (int i = 0; i < n; i++) {

                if (nums[i] == nums[index]) {
                    used[i] = true;
                }
            }
        }

        return result;
    }
}