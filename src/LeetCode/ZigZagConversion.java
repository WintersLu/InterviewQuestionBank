package LeetCode;

public class ZigZagConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		convert("mhfwkgnsypqvizitubycqlkcmdqstqxfaeekmtfkixhtysostmvlahnmmgggwfnwjtjvmq", 24);
	}

	public static String convert(String s, int nRows) {
		String[] rows = new String[nRows];
		int rowIndex = 0;
		int next;
		if (nRows == 1)
			next = 0;
		else
			next = -1;
		for (int i = 0; i < s.length(); i++) {
			if (rowIndex == 0 || rowIndex == nRows - 1)
				next = -next;
			if(rows[rowIndex] == null) rows[rowIndex] = "";
			rows[rowIndex] += s.charAt(i);
			rowIndex += next;
		}
		String result = "";
		for (int i = 0; i < rows.length; i++) {
			result += rows[i] == null? "": rows[i];
		}
		return result;
	}

}
