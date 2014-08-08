package LeetCode;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode buildTree(int[] inorder, int[] postorder) {
		return recurBuildTree(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
		
	}
	
	public TreeNode recurBuildTree(int[] inorder, int iStart, int iEnd, int[] postorder, int pStart, int pEnd) {
		
		if(iStart > iEnd || pStart > pEnd) return null;
		TreeNode top = new TreeNode(postorder[pEnd]);
		
		int topIndex = -1;
		for(int i=iStart; i<=iEnd; i++){
			if(inorder[i] == postorder[pEnd]) topIndex = i;
		}
		
		TreeNode left = recurBuildTree(inorder, iStart, topIndex-1, postorder, pStart, pEnd-1-(iEnd-topIndex));
		TreeNode right = recurBuildTree(inorder, topIndex+1, iEnd, postorder, pEnd-(iEnd-topIndex), pEnd-1);
		top.left = left;
		top.right = right;
		return top;
	}
	
	
	

}
