class MyQueue {

    Stack<Integer> stack;
    Stack<Integer> revStack; 

    public MyQueue() {
        stack = new Stack<>();
        revStack = new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        rotate(stack, revStack);
        return revStack.pop();
    }
    
    public int peek() {
        rotate(stack, revStack);
        return revStack.peek();
    }
    
    public boolean empty() {

        return stack.isEmpty() && revStack.isEmpty();
        
    }

    private void rotate(Stack<Integer> stack, Stack<Integer> revStack){
        if(revStack.isEmpty()){
            while(!stack.isEmpty()){
                revStack.push(stack.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */