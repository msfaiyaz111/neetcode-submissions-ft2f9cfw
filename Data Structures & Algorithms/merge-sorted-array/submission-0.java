class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = nums1.length-1;
        int j = n-1;
        while(n!=0){
            if(i==0){

            }
            if(i-n <0 || nums1[i-n] < nums2[j]){
                nums1[i] = nums2[j];
                j--;
                n--;
                
            }
            else{
                nums1[i] = nums1[i-n];
            }
            i--;
        }
    }
}