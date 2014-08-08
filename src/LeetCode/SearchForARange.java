package LeetCode;

public class SearchForARange {

	public static void main(String[] args) {
		int[] input = {5, 7, 7, 8, 8, 10};
		int[] input1 = {2, 2};
		SearchForARange s = new SearchForARange();
		s.searchRange(input1, 2);
	}
	
	public int[] searchRange(int[] A, int target) {
        int[] result = new int[2];
        result[0] = recurStart(A, target, 0, A.length-1);
        result[1] = recurEnd(A, target, 0, A.length-1);
        return result;
    }
    
    public int recurStart(int[] A, int target, int start, int end){
        if(start == end && A[start] == target) return start;
        else if(start >= end) return -1;
        
        int center = (start + end)/2;
        
        if(A[center] == target) return recurStart(A, target, start, center);
        else if(A[center] > target) return recurStart(A, target, start, center-1);
        else return recurStart(A, target, center+1, end);
    }
    
    public int recurEnd(int[] A, int target, int start, int end){
        if(start == end && A[start] == target) return start;
        else if(start >= end) return -1;
        
        int center = (start + end)/2+1;
        
        if(A[center] == target) return recurEnd(A, target, center, end);
        else if(A[center] > target) return recurEnd(A, target, start, center-1);
        else return recurEnd(A, target, center+1, end);
    }

}
