class Solution {
    public int searchInsert(int[] nums, int target) {
        int l =0;
        int r = nums.length -1;
        while(l<=r){
            int t = l + (r-l)/2;
            if(nums[t] == target){
                return t;
            }else if(nums[t] >target){
            
                r = t-1;
            }else if(nums[t] < target){
                
                l = t+1;
            }
        }
         return l;
    }
}