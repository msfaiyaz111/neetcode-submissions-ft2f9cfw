class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<Integer> ans;
        List<List<Integer>> l = new ArrayList<>();
        for(int i=0; i<nums.length-3; i++){
            for(int j=i+1; j<nums.length-2; j++){
                for(int k=j+1; k<nums.length-1; k++){
                    for(int m=k+1; m<nums.length; m++){
                        if((long)nums[i] + (long)nums[j] + (long)nums[k] + (long)nums[m] == (long)target){
                            ans = new ArrayList<>();
                            ans.add(nums[i]);
                            ans.add(nums[j]);
                            ans.add(nums[k]);
                            ans.add(nums[m]);
                            Collections.sort(ans);
                            if(!l.contains(ans)){
                                l.add(ans);
                            }
                        }
                    }
                }
            }
        }
        return l;
    }
}