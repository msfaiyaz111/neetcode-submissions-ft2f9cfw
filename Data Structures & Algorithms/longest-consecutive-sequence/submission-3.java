class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0){
            return 0;
        }
        Set<Integer> s = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            s.add(nums[i]);
        }
        int max = 1;
        for(int i=0; i<nums.length; i++){
            int c=1;
            int temp=nums[i];
            while(s.contains(temp+1)){
                c++;
                temp++;
            }
            if(c>max){
                max=c;
            }
        }
        return max;
    }
}
