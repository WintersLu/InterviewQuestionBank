package LeetCode;

import java.util.Stack;

public class MinStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	private Stack<Integer> stack = new Stack<Integer>();
    private Stack<Integer> minStack = new Stack<Integer>();
    
    public void push(int x) {
        stack.push(x);
        if(minStack.isEmpty()) minStack.push(x);
        else if(x <= minStack.peek()) minStack.push(x);
    }

    public void pop() {
        int out = stack.pop();
        if(minStack.peek() == out) minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

}
