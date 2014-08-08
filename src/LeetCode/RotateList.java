package LeetCode;

public class RotateList {

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		RotateList r = new RotateList();
		r.rotateRight(n1, 3);

	}

	public ListNode rotateRight(ListNode head, int n) {
		ListNode tmp = head;
		int count = 0;
		while (tmp != null) {
			tmp = tmp.next;
			count++;
		}
		n = n % count;
		if(n == 0) return head; // 
		
		ListNode ahead = head;
		ListNode end = head;
		while (n-- >= 0)
			ahead = ahead.next;
		while(ahead != null) {
			ahead = ahead.next;
			end = end.next;
		}
		ListNode result = end.next;
		end.next = null;
		ListNode pointer = result;
		while(pointer.next != null) pointer = pointer.next;
		pointer.next = head;
		return result;
	}

}
