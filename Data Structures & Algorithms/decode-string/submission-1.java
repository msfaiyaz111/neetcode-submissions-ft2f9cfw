class Solution {
    int i=0;
    public String decodeString(String s) {
        return getString(s);
    }

    String getString(String s){
        StringBuilder ans = new StringBuilder();
        int k=0;
        while(i<s.length()){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                k = k*10 +(c-'0');
            }
            else if(c == '[') {
                i++;
                String sub = getString(s);
                while(k-- > 0) ans.append(sub);
                k = 0;
            }
            else if(c==']'){
                return ans.toString();
            }
            else{
                ans.append(c);
            }
            i++;
        }
        return ans.toString();
    }
}