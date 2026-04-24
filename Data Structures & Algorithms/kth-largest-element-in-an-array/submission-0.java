class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> q = new PriorityQueue<Integer>(
            (a,b) -> b-a 
        );
        for(int i=0; i<nums.length; i++){
            q.add(nums[i]);
        }
        for(int i=0; i<k-1; i++){
            q.poll();
        }
        return q.poll();
    }
}
