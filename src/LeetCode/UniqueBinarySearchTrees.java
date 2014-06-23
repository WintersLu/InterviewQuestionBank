package LeetCode;

public class UniqueBinarySearchTrees {

	public static void main(String[] args) {
		UniqueBinarySearchTrees ub = new UniqueBinarySearchTrees();
		ub.numTrees(5);
	}

	public int numTrees(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int result = numNode(1, n);
        return result;
    }
    
    public int numNode(int s, int e){
        if(s >= e) return 1;
        
        int count = 0;
        for(int i = s; i<=e; i++) {
            count += numNode(s, i-1) * numNode(i+1, e);
        }
        return count;
    }

//	  Solution 2
//    public int numTrees(int n) {
//        int result = 1;
//        for(int i=1; i<=n; i++)
//            result=result*2*(2*i-1)/(i+1);
//        return result;
//    }

}
