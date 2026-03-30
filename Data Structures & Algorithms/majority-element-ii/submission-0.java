class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        int n = nums.length/3;
        for(int i = 0; i < nums.length; i++){
            if(ht.containsKey(nums[i])){
                ht.put(nums[i], ht.get(nums[i])+1);
            }else{
                ht.put(nums[i], 1);
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int i : ht.keySet()){
            if(ht.get(i)>n){
                res.add(i);
            }
        }
        return res;
    }
}