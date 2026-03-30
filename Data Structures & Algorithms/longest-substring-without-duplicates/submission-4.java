class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(Objects.equals(s, "")){
            return 0;
        }
        int maxlen = 1;
        char[] c = s.toCharArray();
        HashMap<Character, Integer> h = new HashMap<>();
        for(int i=0;i<c.length-1; i++){
            h.put(c[i], i);
            for(int j=i+1; j<c.length; j++){
                if(h.containsKey(c[j])){
                    maxlen = Math.max(maxlen, j-i);
                    i = h.get(c[j]);
                    h.clear();
                    break;
                }else{
                    h.put(c[j], j);
                    if(j == c.length-1){
                        maxlen = Math.max(maxlen, j-i+1);
                        break;
                    }
                }
            }
        }
        return maxlen;
    }
}