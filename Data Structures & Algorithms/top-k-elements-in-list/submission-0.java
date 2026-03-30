class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
       int max = 0;
       for(int i = 0; i<nums.length; i++){
        if(ht.containsKey(nums[i])){
            int c = ht.get(nums[i]);
            ht.remove(nums[i]);
            ht.put(nums[i], c+1);
            if(c+1  > max) {
                max = c+1;
            }
        }
        else{
            ht.put(nums[i],1);
            if(1>max){
                max=1;
            }
        }
       }
       int[] temp = new int[k];
       int j=0;
       while(k!=j){
        for(int i : ht.keySet()){
            if(ht.get(i)==max){
            temp[j] = i;
            j++;
            }
        }
        max--;
       }
       return temp;
    }
}