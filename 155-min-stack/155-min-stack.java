class MinStack {
    private final Deque<Integer> deque;
    public MinStack() {
        deque = new ArrayDeque<>();
        
    }
    
    public void push(int val) {
        deque.add(val);
    }
    
    public void pop() {
        deque.removeLast();
    }
    
    public int top() {
        return deque.peekLast();
        
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(Integer i : deque){
            if(min > i){
                min = i;
            }            
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */