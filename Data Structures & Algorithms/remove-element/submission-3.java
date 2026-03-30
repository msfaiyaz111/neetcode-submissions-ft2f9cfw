class Solution {
    public int removeElement(int[] nums, int val) {
        int temp = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == val){
                temp++;
                if(i != nums.length-1){
                for(int j=i, k=i+1; k<nums.length; j++, k++){
                    nums[j] = nums[k];
                }
                }
                nums[nums.length-1] = -1;
                i = i-1;
            }
        }
        return nums.length-temp;
    }
}