class MinStack {
    Stack<Integer> stk = new Stack<>();    //maintain general stack
    Stack<Integer> minstk = new Stack<>();  //maintain min stack 
    
    public MinStack() {
        
    }
    
    public void push(int val) {
        stk.push(val);
        if(!minstk.isEmpty()){
            if(minstk.peek() > val){  //if curr val is small 
                minstk.push(val);  //then we will push it into minstk
            }
            else{
                minstk.push(minstk.peek());  //else continue same prev minstk
            }
        }
        else{
            minstk.push(val);  //if stk is empty then push val directly into minstk also 
        }
    }
    
    public void pop() {
        stk.pop();
        minstk.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return minstk.peek();
    }
}