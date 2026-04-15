class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = 0;
        int r = 0;
        int[] arr = new int[nums1.length + nums2.length];
        while(l+r < nums1.length + nums2.length){
            if(l == nums1.length){
                arr[r+l] = nums2[r];
                r++;
            }else if(r == nums2.length){
                arr[r+l] = nums1[l];
                l++;
            }
            else if(nums1[l] <= nums2[r]){
                arr[l+r] = nums1[l];
                l++;
            }else if(nums1[l] >= nums2[r]){
                arr[l+r] = nums2[r];
                r++;
            }
        }
        if(arr.length%2 == 1) return arr[arr.length/2];
        else return ((float)arr[arr.length/2] + (float)arr[arr.length/2 -1])/2;
    }
}
