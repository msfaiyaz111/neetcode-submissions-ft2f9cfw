class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        int length = ans.length();
        while(length !=0){
            for(String s : strs){
                if(!s.regionMatches(0, ans, 0, length)){
                    length--;
                    break;
                }
                if(s.equalsIgnoreCase(strs[strs.length-1])){
                    return ans.substring(0, length);
                }
            }
        }
        return "";

    }
}