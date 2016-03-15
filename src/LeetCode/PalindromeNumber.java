package LeetCode;

public class PalindromeNumber {

	public static void main(String[] args) {
		PalindromeNumber p = new PalindromeNumber();
		p.isPalindrome(111);

	}
	
	public boolean isPalindrome(int x) {
        if(x<0) return false;
        int div = 1;
        while(x/div >= 10){
            div*=10;
        }
        while(x>0){
            if(x/div != x%10) return false;
            x = x%div/10;
            div/=100;
        }
        return true;
    }
}
