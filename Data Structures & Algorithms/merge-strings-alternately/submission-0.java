class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s = "";
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        int i = 0 , j = 0;
        while(s.length() != word1.length() + word2.length()){
            if(i<word1.length()){
                s +=arr1[i];
                i++;
            }
            if(j<word2.length()){
                s +=arr2[j];
                j++;
            }
        }
        return s;
    }
}