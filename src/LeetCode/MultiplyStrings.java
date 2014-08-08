package LeetCode;

public class MultiplyStrings {

	public static void main(String[] args) {
		MultiplyStrings m = new MultiplyStrings();
		m.multiply("012", "03");
	}
	
	
	public String multiply(String num1, String num2) {
        
		int[] result = new int[num1.length() + num2.length()-1];
		for(int i=num1.length()-1; i>=0; i--){
			for(int j=num2.length()-1; j>=0; j--){
				result[i+j] += (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
			}
		}
		
		String num = "";
		for(int i=result.length-1; i>=0; i--){
			int digit = result[i]%10;
			int carry = result[i]/10;
			if(i-1>=0){
				result[i-1] += carry;
				num = "" + digit + num;
			}else
				num = "" + carry + digit + num;
		}
		for(int i=0; i<num.length(); i++){
			if(num.charAt(i) != '0') return num.substring(i);
			if(i == num.length()-1) return num.substring(i);
		}
		return num;
    }
    
}
