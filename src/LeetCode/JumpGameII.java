package LeetCode;

public class JumpGameII {

	public static void main(String[] args) {
		int[] input = {2,1,0,1,4};
		System.out.println(jump(input));

	}

	public static int jump(int[] A) {
		int start = 0, end = 0, step = 0;
		if(A.length <= 1) return 0;
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
