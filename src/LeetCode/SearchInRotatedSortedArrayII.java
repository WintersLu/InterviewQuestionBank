package LeetCode;

public class SearchInRotatedSortedArrayII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean search(int[] A, int target) {
        return recurSearch(A, target, 0, A.length-1);
    }
    
    
    public boolean recurSearch(int[] A, int target, int start, int end){
        if(start > end) return false;
        
        int center = (start + end)/2;
        if(A[center] == target) return true;
        if(A[center] > A[start] ){
            if(A[start] <= target && target <= A[center])
                return recurSearch(A, target, start, center-1);
            else return recurSearch(A, target, center+1, end);
        }else if(A[center] < A[start]){
            if(A[center] <= target && target <= A[end])
                return recurSearch(A, target, center+1, end);
            else return recurSearch(A, target, start, center-1);
        }else return recurSearch(A, target, start+1, end);
    }

}
