class MyQueue {
    Stack<Integer> mainS;
    Stack<Integer> helperS;
    /** Initialize your data structure here. */
    public MyQueue() {
        mainS = new Stack<>();
        helperS = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        mainS.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while(mainS.size() > 1){
            helperS.push(mainS.pop());
        }
        
        int val = mainS.pop();
        
        while(helperS.size()>0){
            mainS.push(helperS.pop());
        }
        
        return val;
    }
    
    /** Get the front element. */
    public int peek() {
        while(mainS.size() > 1){
            helperS.push(mainS.pop());
        }
        
        int val = mainS.peek();
        
        while(helperS.size()>0){
            mainS.push(helperS.pop());
        }
        
        return val;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if (mainS.size()!=0) return false;
        else return true;
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
