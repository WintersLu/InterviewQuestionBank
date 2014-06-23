package LeetCode;

public class SubmissionDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public int removeElement(int[] A, int elem) {
        int bound = A.length - 1;
        for(int i=A.length-1; i>=0; i--){
            if(A[i] == elem){
                int tmp = A[i];
                A[i] = A[bound];
                A[bound] = tmp;
                bound--;
            }
        }
        return bound +1;
    }

}
