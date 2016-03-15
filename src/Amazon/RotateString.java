package Amazon;

public class RotateString {

	public static void main(String[] args) {
		System.out.println(rotateString("asdfGHJ", "dfGHJas"));
		System.out.println(rotateString("a", "a"));
		System.out.println(rotateString("aa", "aa"));
		System.out.println(rotateString("aa", "ab"));
		System.out.println(rotateString("aba", "baa"));
	}
	
	public static boolean rotateString(String s1, String s2){
		int len = s1.length();
		if(len == s2.length() && len > 0){
			String s1s1 = s1 + s1;
			return s1s1.contains(s2);
		}
		return false;
	}

}
