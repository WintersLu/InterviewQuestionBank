package LeetCode;

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int climbStairs(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        
        int l = 1, m = 2, k = 0;
        for(int i = 3; i<=n; i++){
            k = l + m;
            l = m;
            m = k;
        }
        return k;
    }
	
	
//	public int climbStairs(int n) {
//        if(n == 0) return 1;
//        if(n == 1) return 1;
//        return climbStairs(n-1) + climbStairs(n-2);
//    }

}
