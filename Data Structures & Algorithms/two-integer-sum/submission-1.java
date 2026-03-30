class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            h.put(nums[i], i);
        }
        int[] diff = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            diff[i] = target - nums[i];
        }
        for(int i=0;i<nums.length; i++){
            if(h.containsKey(diff[i]) && i != h.get(diff[i])){
                return new int[]{i, h.get(diff[i])};
            }
        }
        return new int[]{0,1};
    }
}
