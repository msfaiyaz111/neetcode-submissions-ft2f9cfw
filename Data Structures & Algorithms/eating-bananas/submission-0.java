class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int r = piles[0];
        for(int i=1; i<piles.length; i++){
            r = Math.max(r, piles[i]);
        }
        int ans = r;
        int l = 1;
        while(l <=r ){
            int k = (l+r)/2;
            int total = totalTime(piles, k);
        
        if(total <= h){
            ans = k;
            r = k-1;
        } else{
            l = k+1;
        }
        }

        return ans;




    }

    public int totalTime(int[] piles, int speed){
        int ans = 0;
        for(int i=0; i<piles.length; i++){
            ans += Math.ceil((double)piles[i]/speed);
        }
        return ans;
    }
}
