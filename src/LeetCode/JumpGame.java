package LeetCode;

public class JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean canJump(int[] A) {
        int max = 1;
        
        for(int i=1; i<=max && i<= A.length; i++){
            if(max < i + A[i-1]) max = i + A[i-1];
        }
        if(max >= A.length) return true;
        else return false;
    }

}
