package LeetCode;

public class PalindromeNumber {

	public static void main(String[] args) {
		PalindromeNumber p = new PalindromeNumber();
		p.isPalindrome(12521);

	}
	
	public boolean isPalindrome(int x) {
        if(x<0)return false; 
        int div = 1;
        while(x / div>=10){
            div*=10;
        }
        while(x>0){
            int l = x/div;
            int m = x%10;
            if(l != m) return false;
            x=x%div/10;
            div/=100;
        }
        return true;
    }
}
