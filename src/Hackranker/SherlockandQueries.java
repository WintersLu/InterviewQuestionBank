package Hackranker;

import java.util.HashMap;
import java.util.Map;


public class SherlockandQueries {

	public static void main(String[] args) {
		int[] A = {1, 2, 3, 4};
		int[] B = {1, 2, 3};
		int[] C = {13, 29, 71};
		
		int[] input = {1, 4, 5, 3, 2};
		
		icecream(input, 4);
		
//		Solve(A, B, C);
	}

	private static void Solve(int[] A, int[] B, int[] C) {

		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < A.length; j++) {
				int tmp = j + 1 % B[i];
				if ((j + 1) % B[i] == 0) {
					A[j] = A[j] * C[i];
				}
			}
		}
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
	}
	
	static void icecream(int[] all, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for(int i=0; i<all.length; i++){
	        if(map.containsKey(all[i])){
	            int a = map.get(all[i]) + 1;
	            int b = i+1;
	            
	            System.out.println(a + " " + b);
	            
	        }else{
	            map.put(target - all[i], i);
	        }
	    }
	}

}
