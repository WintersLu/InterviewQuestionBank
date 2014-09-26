package LeetCode;

public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intToRoman(756);
	}

	public static String intToRoman(int num) {
		char[] roman = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
		int[] val = { 1, 5, 10, 50, 100, 500, 1000 };

		String result = "";
		for (int i = val.length - 1; i >= 0; i--) {
			while (num >= val[i]) {
				result += roman[i];
				num -= val[i];
			}
			switch (val[i]) {
			case 5:
			case 10:
				if (val[i] - num == 1) {
					result += "" + roman[0] + roman[i];
					num = num + val[0] - val[i];
				}
				break;
			case 50:
			case 100:
				if (val[i] / 10 - num / 10 == 1) {
					result += "" + roman[2] + roman[i];
					num = num + val[2] - val[i];
				}
				break;
			case 500:
			case 1000:
				if (val[i] / 100 - num / 100 == 1) {
					result += "" + roman[4] + roman[i];
					num = num + val[4] - val[i];
				}
				break;
			default:
			}
		}
		return result;
	}

}
