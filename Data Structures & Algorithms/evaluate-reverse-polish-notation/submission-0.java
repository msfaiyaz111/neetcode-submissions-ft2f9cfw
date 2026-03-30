class Solution {
    public int evalRPN(String[] tokens) {
        doubleyLinkedList head = new doubleyLinkedList(tokens[0], null, null);
        doubleyLinkedList curr = head;
        for(int i=1; i<tokens.length; i++){
            doubleyLinkedList temp = new doubleyLinkedList(tokens[i], curr, null);
            curr.next = temp;
            curr = temp;
        }   
        curr = head;
        while(curr != null){
            if("+-*/".contains(curr.token)){
                int res = 0;
                int l = Integer.parseInt(curr.prev.prev.token);
                int r = Integer.parseInt(curr.prev.token);
                if(curr.token.equals("+")){
                    res = l+r;
                }
                else if(curr.token.equals("-")){
                    res = l-r;
                }
                else if(curr.token.equals("*")){
                    res = l*r;
                }
                else if(curr.token.equals("/")){
                    res = l/r;
                }

                curr.prev.prev.token = String.valueOf(res);
                curr.prev.prev.next = curr.next;
                if(curr.next != null) curr.next.prev = curr.prev.prev;
                curr = curr.prev.prev;
            }
            else{
                curr = curr.next;
            }

        }
        return Integer.parseInt(head.token);
    }
}
class doubleyLinkedList {
    String token;
    doubleyLinkedList prev;
    doubleyLinkedList next;

    public doubleyLinkedList(String token, doubleyLinkedList prev, doubleyLinkedList next){
        this.token = token;
        this.prev = prev;
        this.next = next;
    }
}