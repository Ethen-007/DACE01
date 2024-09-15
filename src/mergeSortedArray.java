class mergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int insert = nums1.length - 1;
        int p1 = m - 1;
        int p2 = n - 1;
        
        while (p1 >= 0 && p2 >= 0) {
            int n1 = nums1[p1];
            int n2 = nums2[p2];
            if (n1 > n2) {
                nums1[insert] = n1;
                p1--;
            } else {
                nums1[insert] = n2;
                p2--;
            }
            insert--;
        }
        
        while (p2 >= 0) {
            nums1[insert] = nums2[p2];
            p2--;
            insert--;
        }
    }
}
