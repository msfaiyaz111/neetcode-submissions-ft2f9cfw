class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(Objects.equals(s, "")){
            return 0;
        }
        int maxlen = 0;
        int l=0;
        HashSet<Character> h = new HashSet<>();
        for(int i=0;i<s.length(); i++){
            while(h.contains(s.charAt(i))){
                h.remove(s.charAt(l));
                l++;
            }
            h.add(s.charAt(i));
            maxlen = Math.max(maxlen, h.size());
            }
        return maxlen;
    }
}