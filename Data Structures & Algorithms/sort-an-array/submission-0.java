class Solution {
    public int[] sortArray(int[] nums) {

        if(nums.length==1){
            return nums;
        }
        int[] temp1 = new int[nums.length/2];
        int[] temp2 = new int[nums.length - temp1.length];
        for(int i=0; i<nums.length; i++){
            if(i<nums.length/2){
                temp1[i] = nums[i];
            }
            else{
                temp2[i-nums.length/2] = nums[i];
            }
        }
        temp1 = sortArray(temp1);
        temp2 = sortArray(temp2);
        for(int i=0, j=0; i<temp1.length || j<temp2.length;){
            if(i==temp1.length){
                nums[i+j] = temp2[j];
                j++;
            }
            else if(j==temp2.length){
                nums[i+j] = temp1[i];
                i++;
            }
            else if( temp1[i]<temp2[j]){
                nums[i+j] = temp1[i];
                i++;
            }
            else{
                nums[i+j] = temp2[j];
                j++;
            }
        }
        return nums;
    }
}