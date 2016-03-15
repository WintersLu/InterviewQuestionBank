package LeetCode;

public class FlattenBinaryTreeToLinkedList {

	public static void main(String[] args) {
		FlattenBinaryTreeToLinkedList f = new FlattenBinaryTreeToLinkedList();
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		root.left = node1;
		node1.left = node2;
		
		f.flatten(root);

	}
	
	public void flatten(TreeNode root) {
        if(root == null) return;
        TreeNode result = flat(root);
        System.out.println(result);
    }
    
	public TreeNode flat(TreeNode node){
		if(node == null) return null;
        if(node.left == null && node.right == null) return node;
        
        TreeNode rightStart = node.right;
        TreeNode leftEnd = flat(node.left);
        if(leftEnd != null) {
            leftEnd.right = rightStart;
            node.right = node.left;
            node.left = null;
        }
        if(rightStart == null) return leftEnd;
        else return flat(rightStart);
    }

}
