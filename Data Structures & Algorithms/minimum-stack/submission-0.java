class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> mintrack = new Stack<>();

    public MinStack() {
    }
    
    public void push(int val) {
        if(mintrack.empty() || val <= mintrack.peek()){
            mintrack.push(val);
        }
        st.push(val);
    }
    
    public void pop() {
        if(mintrack.peek().equals(st.peek())) mintrack.pop();
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return mintrack.peek();
    }
}
