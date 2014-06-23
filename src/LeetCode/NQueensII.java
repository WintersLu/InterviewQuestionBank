package LeetCode;

public class NQueensII {

	public static void main(String[] args) {
		NQueensII nq = new NQueensII();
		nq.totalNQueens(4);

	}

	public int totalNQueens(int n) {
        int[] pos = new int[n];
        int result = 0;
        for(int i=0; i<n; i++){
            pos[0] = i;
            result += recursiveTotal(pos, 1);
        }
        return result;
    }
    
    public int recursiveTotal(int[] pos, int k) {
        if(k>= pos.length) return 1;
    
        int count = 0;
        for(int i=0; i<pos.length; i++) {
            if(isValidPos(pos, i, k)){
                pos[k] = i;
                count += recursiveTotal(pos, k+1);
            }
        }
        return count;
    }
    
    public boolean isValidPos(int[] pos, int i, int k){
        for(int l=0; l<k; l++){
            if(pos[l] == i) return false;
            if(Math.abs(pos[l] - i) == Math.abs(k-l)) return false;
        }
        return true;
    }
	
}
