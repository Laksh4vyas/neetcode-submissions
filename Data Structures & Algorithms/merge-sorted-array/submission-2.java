class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;         // Pointer for valid nums1 elements
        int p2 = n - 1;         // Pointer for nums2 elements
        int p = m + n - 1;      // Pointer for the insertion index

        // Loop 1: Compare and place the larger element at the back
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--; // Crucial: moves pointer left
            } else {
                nums1[p] = nums2[p2];
                p2--; // Crucial: moves pointer left
            }
            p--;     // Crucial: moves insertion index left
        }

        // Loop 2: Copy remaining elements from nums2 if any exist
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;    // Crucial: prevents infinite loop
            p--;     // Crucial: prevents infinite loop
        }
    }
}
