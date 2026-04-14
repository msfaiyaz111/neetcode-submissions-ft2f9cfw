class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int t = l + (r-l)/2;
            if(nums[t] == target) return t;
            if(nums[l] <= nums[t]){
                if(nums[l] <= target && target <= nums[t]) r = t-1;
                else l = t+1;
            }
            else{
                if(nums[t] <= target && target <= nums[r]) l = t+1;
                else r = t-1;
            }
        }
        return -1;
    }
}
