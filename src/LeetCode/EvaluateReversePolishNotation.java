package LeetCode;

import java.util.Stack;

public class EvaluateReversePolishNotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public int evalRPN(String[] tokens) {
        if(tokens.length == 0) return 0;
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i=0; i<tokens.length; i++){
            if(!isOperator(tokens[i])){
                stack.push(Integer.parseInt(tokens[i]));
            }
            else{
                int num2 = stack.pop();
                int num1 = stack.pop();
                stack.push(calculate(num1, num2, tokens[i]));
            }
        }
        return stack.pop();
    }
    
    public boolean isOperator(String input){
        if(input.equals("+"))
            return true;
        if(input.equals("-"))
            return true;
        if(input.equals("*"))
            return true;
        if(input.equals("/"))
            return true;
        return false;
    }
    
    public int calculate(int a, int b, String input){
        if(input.equals("+"))
            return a + b;
        if(input.equals("-"))
            return a - b;
        if(input.equals("*"))
            return a * b;
        if(input.equals("/"))
            return a / b;
        return a;
    }

}
