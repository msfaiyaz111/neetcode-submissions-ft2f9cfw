class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> g = new ArrayList<>();
        for(int i=0; i<strs.length; i++){
            List<String> temp = new ArrayList<>();
            if(!strs[i].equals("0")){
                temp.add(strs[i]);
                for(int j=i+1; j<strs.length; j++){
                    if(checkAnagram(strs[i], strs[j])){
                        temp.add(strs[j]);
                        strs[j] = "0";
                    }
                }
            }
            if(temp.size() != 0){
            g.add(temp);
            }
        }
        return g;
    }

    public boolean checkAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        for(int i=0; i<str1.length; i++){
            for(int j=0; j<str2.length; j++){
                if(str1[i] == str2[j]){
                    str2[j] = '0';
                    break;
                }
                else if(str1[i] != str2[j] && j==str2.length-1){
                    return false;
                }
            }
        }
        return true;
    }


}
