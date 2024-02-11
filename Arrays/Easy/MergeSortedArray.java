class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         for(int i=0;i<n;i++)//if (n >= 0) System.arraycopy(num2, 0, num1, m + 0, n);
            nums1[m+i]=nums2[i];
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
