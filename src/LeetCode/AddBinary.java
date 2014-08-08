package LeetCode;

public class AddBinary {

	public static void main(String[] args) {
		AddBinary a = new AddBinary();
		a.addBinary("11", "11");

	}

	public String addBinary(String a, String b) {

		int aLast = a.length() - 1;
		int bLast = b.length() - 1;

		String result = "";
		int carry = 0;
		while (aLast >= 0 || bLast >= 0) {
			int aNum = 0, bNum = 0;
			if(aLast >= 0) aNum = Character.getNumericValue(a.charAt(aLast));
			if(bLast >= 0) bNum = Character.getNumericValue(b.charAt(bLast));
			result = "" + (aNum + bNum + carry) % 2 + result;
			if (aNum + bNum + carry > 1)
				carry = 1;
			else
				carry = 0;
			aLast--;
			bLast--;
		}
		if(carry != 0){
			result = "" + carry + result;
		}
		
		return result;

	}

}
