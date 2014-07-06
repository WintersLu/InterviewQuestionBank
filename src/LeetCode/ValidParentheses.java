package LeetCode;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
            else {
                if(stack.empty()) return false;
                char match = stack.pop();
                if(match == '(' && s.charAt(i) == ')'
                || match == '[' && s.charAt(i) == ']'
                || match == '{' && s.charAt(i) == '}'){
                    continue;
                }else return false;
            }
        }
        if(stack.empty()) return true;
        else return false;
    }

}
