class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int start =1, end=1;
        prefix[0] = 1;
        suffix[nums.length-1] =1;
        for(int i=1; i<nums.length; i++){
            start = start*nums[i-1];
            prefix[i] = start;
            end = end*nums[nums.length-i];
            suffix[nums.length-1-i] = end;
        }
        for(int i=0; i<prefix.length; i++){
            prefix[i] = prefix[i]*suffix[i];
        }
        return prefix;
    }
}