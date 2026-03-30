class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> ans;
        List<List<Integer>> l = new ArrayList<>();
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(nums[i]+nums[j]+nums[k] == 0){
                        ans = ans = new ArrayList<Integer>();
                        ans.add(nums[i]);
                        ans.add(nums[j]);
                        ans.add(nums[k]);
                        Collections.sort(ans);
                        if(!l.contains(ans)){
                            l.add(ans);
                        }
                    }
                }
            }
        }
        return l;
    }
}
