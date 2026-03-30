class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        for(int i=0; i<nums.length; i++){
            if(!ht.containsKey(nums[i])){
                ht.put(nums[i], 1);
            }else{
                int temp = ht.get(nums[i]);
                ht.remove(nums[i]);
                ht.put(nums[i], temp+1);
            }
        }
        int[] sol = new int[k];
        while(k!=0){
            int key = getMost(ht);
            sol[k-1] = key;
            ht.remove(key);
            k--;
        }
        return sol;
    }
    int getMost(Hashtable<Integer, Integer> ht){
        int max =0;
        int k =0;
        for(int key : ht.keySet()){
            if(ht.get(key)>max){
                max = ht.get(key);
                k = key;
            }
        }
        return k;

    }

}
