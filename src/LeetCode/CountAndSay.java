package LeetCode;

public class CountAndSay {

	public static void main(String[] args) {
		CountAndSay c = new CountAndSay();
		c.countAndSay(5);
	}

	public String countAndSay(int n) {

		String result = "1";
		for (int i = 1; i < n; i++) {
			String tmp = result;
			result = "";
			char preChar = tmp.charAt(0);
			int count = 1;
			for (int index = 1; index < tmp.length(); index++) {
				if (tmp.charAt(index) != preChar) {
					result += "" + count;
					result += "" + preChar;
					preChar = tmp.charAt(index);
					count = 1;
				} else {
					count++;
				}
			}
			result += "" + count;
			result += "" + preChar;
		}
		return result;
	}

}
