class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length == 0){
            return false;
        }
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(h.containsKey(nums[i])){
                h.replace(nums[i], h.get(nums[i])+1);
            }
            else{
                h.put(nums[i], 0);
            }
        }
        for(int i : h.keySet()){
            if(h.get(i) > 0){
                return true;
            }
        }
        return false;
    }
}