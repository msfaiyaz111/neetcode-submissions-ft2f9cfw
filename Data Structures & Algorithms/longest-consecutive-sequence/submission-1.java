class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0){
            return 0;
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            hs.add(nums[i]);
        }
        int size =1;
        for(int i=0; i<nums.length; i++){
            int temp_size=0;
            int temp=nums[i];
            
                while(hs.contains(temp)){
                    temp_size++;
                    temp--;
                }
                if(temp_size>size){
                    size = temp_size;
                }
            
        }
        return size;
    }
}