class Solution {
    public boolean validPalindrome(String s) {
        char[] arr = s.toCharArray();
        int count = 0;
        for(int i=0, j = arr.length-1; i<arr.length/2; i++, j--){
            if(arr[i] != arr[j]){
                if(arr[i] == arr[j-1]){
                    i--;
                    count++;
                }
                else if(arr[i+1] == arr[j]){
                    j++;
                    count++;
                }
                else{
                    return false;
                }
            }
            if(count >1){
                return false;
            }
        }
        return true;
    }
}