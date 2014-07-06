package LeetCode;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int lengthOfLastWord(String s) {

		int wordLength = 0;
		boolean isWord = false;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ' && !isWord)
				continue;
			if (s.charAt(i) == ' ' && isWord)
				return wordLength;
			wordLength++;
			isWord = true;
		}
		return wordLength;
	}

}
