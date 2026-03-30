class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l =new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int j=i+1, k= nums.length-1;
            while(j<k){
                //System.out.println("checking "+ i + " "+j+" "+k);
                if(nums[i] + nums[j] + nums[k] == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    //l.add(temp);
                    if(!l.contains(temp)){
                        l.add(temp);
                    }
                    j++;
                }else if(nums[i] + nums[j] + nums[k] > 0){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return l;
    }
}
