class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> st = new Stack<int[]>();
        
        for(int i=0; i<temperatures.length; i++){
            int curr = temperatures[i];
            while(!st.empty() && curr > st.peek()[0]){
                int[] temp = st.pop();
                res[temp[1]] = i - temp[1];
            }
            st.push(new int[]{temperatures[i], i});
        }
        return res;
    }
}
