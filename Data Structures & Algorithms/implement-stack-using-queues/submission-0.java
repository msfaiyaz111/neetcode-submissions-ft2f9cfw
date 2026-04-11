class MyStack {
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    public MyStack() {
        
    }
    
    public void push(int x) {
    if (!q1.isEmpty()) {
        q1.add(x);
    } else {
        q2.add(x);
    }
}
    
    public int pop() {
        if(q1.isEmpty()){
            while(q2.size() != 1){
                q1.add(q2.remove());
            }
            return q2.remove();
        }else{
            while(q1.size() != 1){
                q2.add(q1.remove());
            }
            return q1.remove();
        }
    }
    
    public int top() {
        if(!q2.isEmpty()){
            while(q2.size() != 1){
                q1.add(q2.remove());
            }
            int temp = q2.remove();
            q1.add(temp);
            return temp;
        }else{
            while(q1.size() != 1){
                q2.add(q1.remove());
            }
            int temp = q1.remove();
            q2.add(temp);
            return temp;
        }
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */