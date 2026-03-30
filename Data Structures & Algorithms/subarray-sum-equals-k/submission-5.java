class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum =0;
        int count =0;
        for(int i=0; i<nums.length; i++){
            sum = nums[i];
            if(sum == k){
                count++;
            }
            int j=i+1;
            while(j<nums.length){
                sum +=nums[j];
                if(sum == k){
                    count++;
                }
                j++;
            }
        }
        return count;
    }

}