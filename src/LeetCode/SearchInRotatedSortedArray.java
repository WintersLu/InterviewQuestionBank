package LeetCode;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public int recurSearch(int[] A, int target, int start, int end){
        if(start == end && A[start] == target) return start;
        if(start > end) return -1;
        
        int center = (start + end)/2;
        if(A[center] >= A[start]){
            if(A[start] <= target && target <= A[center]){
                return recurSearch(A, target, start, center);
            }else {
                return recurSearch(A, target, center+1, end);
            }
        }else{
            if(A[center] <= target && target <= A[end]){
                return recurSearch(A, target, center, end);
            }else {
                return recurSearch(A, target, start, center-1);
            }
        }
    }

}
