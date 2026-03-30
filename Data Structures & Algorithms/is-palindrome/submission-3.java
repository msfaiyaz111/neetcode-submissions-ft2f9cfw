class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        char[] charArray = s.toCharArray();
        if(charArray.length < 2){
            return true;
        }
        for(int i=0, j=charArray.length-1; i<charArray.length/2; i++, j--){
            // while(!Character.isLetterOrDigit(charArray[i])){
            //     i++;
            // }
            // while(!Character.isLetterOrDigit(charArray[j])){
            //     j--;
            // }
            if(charArray[i] != charArray[j]){
                return false;
            }
        }
        return true;
    }
}
