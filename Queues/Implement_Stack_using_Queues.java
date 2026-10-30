// 225. Implement Stack using Queues

class MyStack {
    Queue<Integer> q = new LinkedList<>();
    public MyStack() {
        //Constructor
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        int n = q.size();
        for(int i=1;i<n;i++){
            q.add(q.remove());
        }
        return q.remove();
    }
    
    public int top() {
        int n = q.size();
        for(int i=1;i<n;i++){
            q.add(q.remove());
        }
        int val = q.peek();
        q.add(q.remove());
        return val;
    }
    
    public boolean empty() {
        return q.size()==0;
    }
}
