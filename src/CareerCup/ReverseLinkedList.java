package CareerCup;

import LeetCode.ListNode;


public class ReverseLinkedList {

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		ReverseList(n1);
	}
	
	
	public static ListNode ReverseList(ListNode head){
		if(head == null || head.next == null) return head;
		ListNode preNode, curNode, nextNode;
		
		preNode = null;
		curNode = head;
		while(curNode != null){
			nextNode = curNode.next;
			curNode.next = preNode;
			preNode = curNode;
			curNode = nextNode;
		}
		return preNode;
	}

}
