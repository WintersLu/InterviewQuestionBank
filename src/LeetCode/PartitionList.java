package LeetCode;

public class PartitionList {

	public static void main(String[] args) {
		PartitionList p = new PartitionList();
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(1);
		l1.next = l2;
		
		p.partition(l1, 1);

	}

	public ListNode partition(ListNode head, int x) {
		ListNode less = new ListNode(0);
		ListNode greater = new ListNode(0);
		ListNode result = less;
		ListNode middle = greater;

		while (head != null) {
			if (head.val < x) {
				less.next = head;
				less = less.next;
				if(head.next == null)
					greater.next = null;
			} else {
				greater.next = head;
				greater = greater.next;
				if(head.next == null)
					greater.next = null;
			}
			head = head.next;
		}
		less.next = middle.next;
		return result.next;
	}

}
