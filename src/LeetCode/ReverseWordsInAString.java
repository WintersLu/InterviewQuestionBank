package LeetCode;

import java.util.Stack;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		ReverseWordsInAString r = new ReverseWordsInAString();
		r.reverseWords2("the sky is blue");
	}

	public String reverseWords(String s) {

		String result = "";
		if (s.length() == 0)
			return result;

		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				String word = "";
				while (i < s.length() && s.charAt(i) != ' ') {
					word += s.charAt(i);
					i++;
				}
				stack.push(word);
			}
		}
		while (!stack.isEmpty()) {
			result += stack.pop();
			if (!stack.isEmpty())
				result += " ";
		}

		return result;
	}

	public String reverseWords2(String s) {

		String result = "";
		boolean isInWord = false;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				isInWord = true;
			}
			if (s.charAt(i) == ' ' && isInWord) {
				result = addWord(result, s, i + 1);
				isInWord = false;
			}
		}
		if (isInWord)
			result = addWord(result, s, 0);
		return result.trim();
	}

	public String addWord(String result, String s, int start) {
		while (start < s.length() && s.charAt(start) != ' ') {
			result += s.charAt(start++);
		}
		result += " ";
		return result;
	}
}
