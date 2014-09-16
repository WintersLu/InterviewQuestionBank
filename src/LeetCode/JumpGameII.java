package LeetCode;

public class JumpGameII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int jump(int[] A) {
		int start = 0, end = 0, step = 0;
		while(end < A.length){
			int max = 0;
			step++;
			for(int i=start; i<=end; i++){
				if(A[i]+i >= A.length-1){
					return step;
				}
				max = Math.max(max, A[i]+i);
			}
			start = end+1;
			end = max;
		}
		return step;
	}

}
