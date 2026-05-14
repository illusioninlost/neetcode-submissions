class MinStack {

    public Stack<Integer> stack;
    public Stack<Integer> minStack;
    public int minimumValue = Integer.MAX_VALUE;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty()) {
            minimumValue = val;
        } else {
            minimumValue = Math.min(val, minStack.peek());
        }
        minStack.push(minimumValue);
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
        if (!minStack.isEmpty()) {
            minimumValue = minStack.peek();
        } else {
            minimumValue = Integer.MAX_VALUE;
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
     
 
        return minStack.peek();
    }
}
