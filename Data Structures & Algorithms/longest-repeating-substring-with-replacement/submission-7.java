class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int right = 0;
        int left = 0;
        int mostnum = 0;
        int res = 0;
        for(right =0; right<s.length(); right++){
            count[s.charAt(right) - 'A']++;
            mostnum = Math.max(mostnum, count[s.charAt(right) - 'A']);

            while(right - left + 1 - mostnum > k){
                count[s.charAt(left) - 'A']--;
                left++;
            }
          res = Math.max(res, right - left + 1);  
        } 
        return res;
    }
}
