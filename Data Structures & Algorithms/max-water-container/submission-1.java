class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int s = 0;
        int e = heights.length-1;
        while(s<e){
            max = Math.max(max, Math.min(heights[s], heights[e])*(e-s));
            if(heights[s] > heights[e]){
                e--;
            }else{
                s++;
            }
        }
        return max;
    }
}
