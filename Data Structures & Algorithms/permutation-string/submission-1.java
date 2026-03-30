class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()) return false;
        int[] cs1 = new int[26];
        for(int i=0; i<s1.length(); i++){
            cs1[s1.charAt(i) - 'a']++;
        }
        int[] cs2 = new int[26];

        for(int i=0; i<= s2.length() - s1.length(); i++){
            for(int j=0; j<s1.length(); j++){
                cs2[s2.charAt(i+j) - 'a']++;
            }
            if(Arrays.equals(cs1, cs2)) return true;
            cs2 = new int[26];
        }
        return false;

        
    }
}
