class Solution {
    public int mySqrt(int x) {
        int l = 0;
        int r = x;
        int res = l+(r-l)/2;
        while( l<= r){
            int t = l+(r-l)/2;
            if((long)t*t == x){
                return t;
            }else if((long)t*t >x){
                r = t-1;
            }else{
                l = t+1;
                res =t;
            }
        }
        return res;
    }
}