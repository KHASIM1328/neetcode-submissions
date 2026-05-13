class MinStack {

    Stack<Integer> mini;
    Stack<Integer> stack;

    public MinStack() {

        stack = new Stack<>();
        mini = new Stack<>();
        
    }
    
    public void push(int val) {

        stack.push(val);
        if(mini.isEmpty()){
            mini.push(val);
        }
        else{
            mini.push(Math.min(mini.peek(), val));
        }
        
        
    }
    
    public void pop() {
        stack.pop();
        mini.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return mini.peek();
    }
}
