class Solution {
    public String simplifyPath(String path) {
        String[] strAr = path.split("/");
        Stack<String> s = new Stack<>();
        for(String t : strAr){
            if(t.equals(".") || t.equals("")) continue;
            else if(t.equals(".."))
            {
                if(!s.isEmpty()) s.pop();
            }
            else s.push(t);
        }
        Stack<String> temp = new Stack<>();
        while(!s.isEmpty()) temp.push(s.pop());
        String ans = new String();
        while(!temp.isEmpty()){
            ans += "/";
            ans += temp.pop();
        }
        if(ans.equals("")) return "/";
        return ans;
    }
}