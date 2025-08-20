import java.util.Stack;

public class minStack {
    Stack<Integer> st;
    Stack<Integer> minStack;

    public void MinStack() {
        st = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);

        if(minStack.isEmpty() || val<=minStack.peek())
            minStack.push(val);
    }
    
    public void pop() {
        int ch = st.pop();
        if(ch == minStack.peek())
            minStack.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
