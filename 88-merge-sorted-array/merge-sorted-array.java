class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] num = new int[m + n];
        int a = 0;
        int b = 0;
        int i = 0;
        while (a < m && b < n) {
            if (nums1[a] <= nums2[b]) {
                num[i++] = nums1[a];
                a++;
            } else {
                num[i++] = nums2[b];
                b++;
            }
        }
        while (a < m) {
            num[i++] = nums1[a];
            a++;
        }

        while (b < n) {
            num[i++] = nums2[b];
            b++;
        }
        for (int j = 0; j < n + m; j++) {
            nums1[j] = num[j];
        }
    }
}