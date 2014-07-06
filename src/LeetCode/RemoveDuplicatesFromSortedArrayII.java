package LeetCode;

public class RemoveDuplicatesFromSortedArrayII {

	public static void main(String[] args) {
		int[] input = {1,1,1,2,2,3};
		RemoveDuplicatesFromSortedArrayII r = new RemoveDuplicatesFromSortedArrayII();
		r.removeDuplicates(input);
	}

	public int removeDuplicates(int[] A) {
        if(A.length <=1) return A.length;
        
        int dupCount = 1;
        int end = 1;
        int dupValue = A[0];
        for(int i=1; i<A.length; i++){
            if(A[i] == dupValue) dupCount++;
            else dupCount = 1;
            
            if(dupCount<=2){
            	A[end] = A[i];
                dupValue = A[i];
                end++;
            }
        }
        return end;
        
    }

}
