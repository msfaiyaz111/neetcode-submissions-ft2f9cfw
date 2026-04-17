class StockSpanner {
        Stack<Integer> s = new Stack<>();
    public StockSpanner() {
        s = new Stack<>();
    }
    
    public int next(int price) {
        int i=1;
        if(s.isEmpty()) {
            s.push(price);
            return i;
        }
        Stack<Integer> temp = new Stack<>();
        while(!s.isEmpty() && s.peek() <= price){
            temp.push(s.pop());
            i++;
        }
        while(!temp.isEmpty()){
            s.push(temp.pop());
        }
        s.push(price);
        return i;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */