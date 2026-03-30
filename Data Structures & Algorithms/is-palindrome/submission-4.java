class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "");
        cleaned = cleaned.toLowerCase();
        char[] c = cleaned.toCharArray();
        for(int i=0; i<c.length/2; i++){
            if(c[i] != c[c.length-1-i]){
                return false;
            }
        }
        return true;
    }
}