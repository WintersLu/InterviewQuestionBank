package LeetCode;

public class ConvertSortedArrayToBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public TreeNode sortedArrayToBST(int[] num) {
        return recursiveBST(num, 0, num.length-1);
    }
    
    public TreeNode recursiveBST(int[] num, int start, int end) {
        if(start > end) return null;
        
        int center = (start + end)/2;
        
        TreeNode node = new TreeNode(num[center]);
        node.left = recursiveBST(num, start, center-1);
        node.right = recursiveBST(num, center+1, end);
        return node;
    }

}
