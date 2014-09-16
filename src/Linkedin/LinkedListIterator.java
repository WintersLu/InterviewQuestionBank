package Linkedin;

import LeetCode.ListNode;


/*
 * Program an iterator for a Linked List which may include nodes which are nested within other nodes. i.e. (1)->(2)->(3(4))->((5)(6). Iterator returns 1->2->3->4->5->6
 */
public class LinkedListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void iterate(){
		
	}
	
	
	
	
	
	private class ListNode {
		public int val;
		public ListNode next;

		public ListNode(int x) {
			val = x;
			next = null;
		}
	}

}
