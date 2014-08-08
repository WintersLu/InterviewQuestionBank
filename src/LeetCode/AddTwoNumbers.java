package LeetCode;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode pointer = new ListNode(0);
		ListNode result = pointer;

		int carry = 0;
		while (l1 != null && l2 != null) {
			int sum = l1.val + l2.val + carry;
			if (sum >= 10)
				carry = 1;
			else
				carry = 0;
			pointer.next = new ListNode(sum % 10);
			pointer = pointer.next;
			l1 = l1.next;
			l2 = l2.next;
		}

		while (l1 != null) {
			int sum = l1.val + carry;
			if (sum >= 10)
				carry = 1;
			else
				carry = 0;
			pointer.next = new ListNode(sum % 10);
			pointer = pointer.next;
			l1 = l1.next;
		}
		while (l2 != null) {
			int sum = l2.val + carry;
			if (sum >= 10)
				carry = 1;
			else
				carry = 0;
			pointer.next = new ListNode(sum % 10);
			pointer = pointer.next;
			l2 = l2.next;
		}
		if (carry == 1) {
			pointer.next = new ListNode(1);
		}

		return result.next;
	}

}
