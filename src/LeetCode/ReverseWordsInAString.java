package LeetCode;

import java.util.Stack;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		ReverseWordsInAString r = new ReverseWordsInAString();
		r.reverseWords("the sky is blue");
	}

	public String reverseWords(String s) {
		
		String result = "";
		if(s.length() == 0) return result;
		
		Stack<String> stack = new Stack<String>();
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i) != ' '){
				String word = "";
				while(i<s.length() && s.charAt(i) != ' '){
					word += s.charAt(i);
					i++;
				}
				stack.push(word);
			}
		}
		while(!stack.isEmpty()){
			result += stack.pop();
			if(!stack.isEmpty()) result += " ";
		}
		
		return result;
	}
}
