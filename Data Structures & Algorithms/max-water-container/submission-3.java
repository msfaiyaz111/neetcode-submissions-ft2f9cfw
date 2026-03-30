class Solution {
    public int maxArea(int[] heights) {
        int ans=0;
        for(int i=0; i<heights.length-1; i++){
            for(int j=heights.length-1; j>i; j--){
                ans = Math.max(ans, getArea(heights,i,j));
            }
        }
        return ans;
    }
    int getArea(int[] heights, int i, int j){
        return (j-i)*Math.min(heights[i], heights[j]);
    }
}