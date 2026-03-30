class Solution {
    public int maxArea(int[] heights) {
        int ans=0;
        int i=0, j= heights.length-1;
        while(j>i){
            ans = Math.max(ans, getArea(heights, i, j));
            if(heights[i]<heights[j]){
                i++;
            }else{
                j--;
            }
        }

        return ans;
    }
    int getArea(int[] heights, int i, int j){
        return (j-i)*Math.min(heights[i], heights[j]);
    }
}
