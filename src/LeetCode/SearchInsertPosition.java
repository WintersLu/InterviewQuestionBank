package LeetCode;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public int searchInsert(int[] A, int target) {
        if(A.length == 0) return 0;
        return divideSearch(A, target, 0, A.length-1);
    }
    
    public int divideSearch(int[] A,  int target, int start, int end){
        if(start == end) {
            if(target > A[start]) return start + 1;
            else return start;
        }
        
        int center = (start + end)/2;
        if(A[center] == target) return center;
        if(A[center] < target) return divideSearch(A, target, center+1, end);
        else return divideSearch(A, target, start, center);
    }

}
