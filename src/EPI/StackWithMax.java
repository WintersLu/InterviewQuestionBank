package EPI;

import java.util.Stack;

public class StackWithMax {
	
	public static class MaxStack{
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> max = new Stack<Integer>();
		
		public void push(int item){
			stack.push(item);
			if(max.isEmpty() || item >= max.peek())
				max.push(item);
		}
		
		public int max(){
			return max.peek();
		}
		
		public int pop(){
			if(stack.isEmpty()) throw new RuntimeException();
			int result = stack.pop();
			if(result == max.peek())
				max.pop();
			return result;
		}
	}
	
	

	public static void main(String[] args) {
		MaxStack s = new MaxStack();
        s.push(1);
        s.push(2);
        assert(s.max() == 2);
        System.out.println(s.max()); // 2
        System.out.println(s.pop()); // 2
        assert(s.max() == 1);
        System.out.println(s.max()); // 1
        s.push(3);
        s.push(2);
        assert(s.max() == 3);
        System.out.println(s.max()); // 3
        s.pop();
        assert(s.max() == 3);
        System.out.println(s.max()); // 3
        s.pop();
        assert(s.max() == 1);
        System.out.println(s.max()); // 1
        s.pop();
        try {
            s.max();
            s.pop();
            s.pop();
            s.pop();
            s.pop();
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
	

}
