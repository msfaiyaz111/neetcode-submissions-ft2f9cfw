class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        for(int i : nums){
            if(ht.containsKey(i)){
                int temp = ht.get(i);
                ht.remove(i);
                ht.put(i,temp+1);
            }else{
                ht.put(i, 1);
            }
        } 
        int[] temp = new int[k];
        for(int i=0; i<k; i++){
            temp[i] = getmax(ht);
        }
        return temp;

    }
    public int getmax(Hashtable<Integer, Integer> ht){
        int max = 0;
        int index = 0;
        for(int i : ht.keySet()){
            if(ht.get(i)>max){
                max = ht.get(i);
                index = i;
            }
        }
        ht.remove(index);
        return index;
    }


}