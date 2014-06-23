package LeetCode;

public class ReverseInteger {

	public static void main(String[] args) {
		ReverseInteger ri = new ReverseInteger();
		ri.reverse(-123);
	}
	
	public int reverse(int x) {
        int result = 0;
        for(;x != 0; x = x/10){
            result = result*10 + x%10;
        }
        return result;
    }

}
