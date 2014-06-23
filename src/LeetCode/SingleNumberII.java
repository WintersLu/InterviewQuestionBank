package LeetCode;

public class SingleNumberII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int singleNumber(int[] A) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        int ones = 0, twos = 0, threes = 0;
        for(int i=0; i<A.length; i++){
            twos |= (ones & A[i]);
            ones ^= A[i];
            threes = ~(ones & twos);
            ones &= threes;
            twos &= threes;
        }
        return ones;
    }

}
