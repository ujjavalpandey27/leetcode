class MyQueue {
   Stack<Integer> st1=new Stack<>();
    Stack<Integer> st2=new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
         while(st1.size()!=0){
            st2.push(st1.pop());
        }
            st1.push(x);
        while(st2.size()!=0){
                st1.push(st2.pop());
            }
    }
    
    public int pop() {
    if(st1.size()!=0){
       return st1.pop();}
       return -1;
        
    }
    
    public int peek() {
          if(st1.size()!=0){
        return st1.peek();
        
        }
        return -1;
    }
    
    public boolean empty() {
         if(st1.size()==0){
            return true;
        }
        return false;
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