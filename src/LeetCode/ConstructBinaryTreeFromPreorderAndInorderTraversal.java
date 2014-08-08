package LeetCode;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		return recurBuildTree(inorder, 0, inorder.length-1, preorder, 0, preorder.length-1);
		
	}
	
	public TreeNode recurBuildTree(int[] inorder, int iStart, int iEnd, int[] preorder, int pStart, int pEnd) {
		
		if(iStart > iEnd || pStart > pEnd) return null;
		TreeNode top = new TreeNode(preorder[pStart]);
		
		int topIndex = -1;
		for(int i=iStart; i<=iEnd; i++){
			if(inorder[i] == preorder[pStart]) topIndex = i;
		}
		
		TreeNode left = recurBuildTree(inorder, iStart, topIndex-1, preorder, pStart+1, pEnd-(iEnd-topIndex));
		TreeNode right = recurBuildTree(inorder, topIndex+1, iEnd, preorder, pEnd-(iEnd-topIndex)+1, pEnd);
		top.left = left;
		top.right = right;
		return top;
	}

}
