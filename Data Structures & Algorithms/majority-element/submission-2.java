class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int major = nums[1];
        int n = 1;
        for(int i = 0; i<nums.length; i++){
            int temp = 1;
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    temp++;
                }
            }
            if(temp > n){
                major = nums[i];
                n = temp;
            }
        }
        return major;
        
        
    }
}