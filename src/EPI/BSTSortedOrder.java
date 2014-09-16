package EPI;

import java.util.Stack;

public class BSTSortedOrder {

	public static void BST(BinarySearchTree<Integer> node){
		Stack<BinarySearchTree<Integer>> stack = new Stack<BinarySearchTree<Integer>>();

		BinarySearchTree<Integer> curr = node;
		while(!stack.isEmpty() || curr != null){
			if(curr != null){
				stack.push(curr);
				curr = curr.getLeft();
			}else{
				curr = stack.pop();
				System.out.print(curr.getData());
				curr = curr.getRight();
			}
		}
	}
	
	
	public static void main(String[] args) {
        //      3
        //    2   5
        //  1    4 6
        BinarySearchTree<Integer> root = new BinarySearchTree<Integer>(3);
        root.setLeft(new BinarySearchTree<Integer>(2));
        root.getLeft().setLeft(new BinarySearchTree<Integer>(1));
        root.setRight(new BinarySearchTree<Integer>(5));
        root.getRight().setLeft(new BinarySearchTree<Integer>(4));
        root.getRight().setRight(new BinarySearchTree<Integer>(6));
        // should output 1 2 3 4 5 6
        BST(root);
    }

}
