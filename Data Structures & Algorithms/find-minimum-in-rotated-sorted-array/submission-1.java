class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int res = nums[0];
        while(l<=r){
            if(nums[l] < nums[r]){
                res = Math.min(res, nums[l]);
                break;
            }
            int t = l + (r-l)/2;
            res = Math.min(res, nums[t]);
            if(nums[l] <= nums[t]) l = t+1;
            else r = t-1;
        }
        return res;
    }
}
