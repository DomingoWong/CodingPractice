class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m+n-1;
        m = m-1;
        n = n-1;
        while (m >= 0 || n >= 0) {
            if (m < 0) {
                nums1[index] = nums2[n];
                index--; n--;
            } else if (n < 0) {
                nums1[index] = nums1[m];
                index--; m--;
            } else if (nums1[m] < nums2[n]) {
                nums1[index] = nums2[n];
                index--; n--;
            } else {
                nums1[index] = nums1[m];
                index--; m--;
            }
        }
        
    }
}