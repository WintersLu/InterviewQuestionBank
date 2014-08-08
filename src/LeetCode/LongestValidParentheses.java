package LeetCode;

import java.util.Stack;

public class LongestValidParentheses {

	public static void main(String[] args) {
		LongestValidParentheses l = new LongestValidParentheses();
		l.longestValidParentheses("()");

	}

	public int longestValidParentheses(String s) {
        if(s == null || s.length() == 0) return 0;
        Stack<Integer> stack = new Stack<Integer>();
        
        
        int last = -1;
        int max = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }else{
                if(stack.isEmpty()) last = i;
                else{
                    stack.pop();
                    if(stack.isEmpty()){
                        max = Math.max(max, i-last);
                    }else{
                        max = Math.max(max, i-stack.peek());
                    }
                }
            }
        }
        return max;
        
    }

}
