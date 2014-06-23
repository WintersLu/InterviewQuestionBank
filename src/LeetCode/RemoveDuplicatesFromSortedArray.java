package LeetCode;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int removeDuplicates(int[] A) {
        if(A.length <= 1) return A.length;
        
        int val = A[0];
        int end = 0;
        for(int i=1; i<A.length; i++){
            if(A[i] == val){
                continue;
            }else {
                val = A[i];
                end++;
                A[end] = val;
            }
        }
        return end+1;
    }

}
