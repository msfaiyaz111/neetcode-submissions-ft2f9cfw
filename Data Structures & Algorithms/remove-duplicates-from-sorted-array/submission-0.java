class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length ==1){
            return 1;
        }
        int i=0, j=1;
        int check = nums[0];
        while(j<nums.length){
            if(check == nums[j]){
                j++;
            }else{
                i++;
                nums[i] = nums[j];
                j++;
                check = nums[i];
            }
        }
        return i+1;
    }
}