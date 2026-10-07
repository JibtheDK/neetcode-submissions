class MinStack {

    
    Stack<Integer> normStack;
    Stack<Integer> minStack;
    public MinStack() {
        normStack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        normStack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
        
    }
    
    public void pop() {
        
        if(normStack.peek().equals(minStack.peek()) ){
            minStack.pop();
        }
        normStack.pop();
    }
    
    public int top() {
        return normStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
