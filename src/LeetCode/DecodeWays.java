package LeetCode;

public class DecodeWays {

	public static void main(String[] args) {
		String input = "101";
		DecodeWays d = new DecodeWays();
		d.numDecodings(input);
	}
	
	
	public int numDecodings(String s) {
		if(s == null || s.length() == 0) return 0;
        int[] count = new int[s.length()];
        
        for(int i=0; i<s.length(); i++){
        	if(i==0){
				if(Integer.parseInt("" + s.charAt(i)) >= 1) count[i] = 1;
				else return 0;
			}
        	else if(i == 1){
        		int tmp = 0;
        		if(Integer.parseInt("" + s.charAt(i-1) + s.charAt(i)) <= 26 && Integer.parseInt("" + s.charAt(i-1) + s.charAt(i)) >= 10) tmp++;
        		if(Integer.parseInt("" + s.charAt(i)) >= 1) tmp += count[i-1];
        		count[i] = tmp;
        	}
        	else {
        		int tmp = 0;
        		if(Integer.parseInt("" + s.charAt(i-1) + s.charAt(i)) <= 26 && Integer.parseInt("" + s.charAt(i-1) + s.charAt(i)) >= 10) tmp += count[i-2];
        		if(Integer.parseInt("" + s.charAt(i)) >= 1) tmp += count[i-1];
        		count[i] = tmp;
        	}
        }
        return count[s.length()-1];
    }

}
