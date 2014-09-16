package Yahoo;

import LeetCode.TreeNode;

public class LowestCommonParentWithPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public TreeNode lowestCommonParent(TreeNode node1, TreeNode node2){
		if(node1 == null || node2 == null)
			return null;
		
		int node1H = 0;
		while(node1 != null){
			node1H++;
			node1 = node1.parent;
		}
		int node2H = 0;
		while(node2 != null){
			node2H++;
			node2 = node2.parent;
		}
		
		if(node2H > node1H){
			node1H ^= node2H;
			node2H ^= node1H;
			node1H ^= node2H;
			TreeNode tmp = node1;
			node1 = node2;
			node2 = tmp;
		}
		
		int diff= node1H - node2H;
		for(int i=0; i<diff ; i++){
			node1 = node1.parent;
		}
		while(node1 != null){
			if(node1 == node2) return node1;
			node1 = node1.parent;
			node2 = node2.parent;
		}
		return null;
	}
	
	
	
	private class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;
		public TreeNode parent;
		public TreeNode(int x) {
			val = x;
		}
	}


}
