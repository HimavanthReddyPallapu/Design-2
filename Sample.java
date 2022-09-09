// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
class MyQueue {
    Stack<Integer> instk,outstk;

    public MyQueue() {
        instk=new Stack<Integer>();
        outstk=new Stack<Integer>();
        
    }
    
    public void push(int x) {
        
        instk.push(x);
    }
    
private void change(){
    while(!instk.isEmpty())
    {
        outstk.push(instk.pop());
    }
}
    public int pop() {
        if(instk.isEmpty()&&outstk.isEmpty())
        {
            return -1;
        }
        else if(!outstk.isEmpty())
        {
            return outstk.pop();
        }
        else
        {
            change();
            return outstk.pop();
        }
        
        
    }

        
    
    public int peek() {
        if(instk.isEmpty()&&outstk.isEmpty())
        {
            return -1;
        }
        else if(!outstk.isEmpty())
        {
            return outstk.peek();
        }
        else
        {
            change();
            return outstk.peek();
        }
    }
    public boolean empty() {
        if(instk.isEmpty() && outstk.isEmpty())
        {
            return true;
        }
        else
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
