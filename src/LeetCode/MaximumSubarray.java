package LeetCode;

public class MaximumSubarray {

	public static void main(String[] args) {
		
		MaximumSubarray max = new MaximumSubarray();
//		int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int[] input2 = {-2, 1,};
		max.maxSubArray(input2);
	}
	
	public int maxSubArray1(int[] A){
		int max = Integer.MIN_VALUE;
		int accum = 0;
		int maxStart = 0;
		int maxEnd = 0;
		int tmpStart = 0;
		for(int i=0; i<A.length; i++){
			accum += A[i];
			if(accum > max){
				max = accum;
				maxStart = tmpStart;
				maxEnd = i;
			}
			if(accum < 0){
				accum = 0;
				tmpStart = i+1;
			}
		}
		return max;
	}
	

	public int maxSubArray(int[] A) {
		int maxStart = 0, maxEnd = 0, tmpStart = 0, max = Integer.MIN_VALUE, accum = 0;
		
		for(int i=0; i<A.length; i++){
			
			accum += A[i];
			if(accum > max){
				max = accum;
				maxStart = tmpStart;
				maxEnd = i;
			}
			if(accum < 0){
				accum = 0;
				tmpStart = i+1;
			}
		}
		return max;
	}

}
