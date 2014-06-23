package LeetCode;

public class LinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean hasCycle(ListNode head) {

		if (head == null)
			return false;
		ListNode oneStep = head;
		ListNode twoStep = head;

		while (twoStep.next != null && twoStep.next.next != null) {
			oneStep = oneStep.next;
			twoStep = twoStep.next.next;
			if (oneStep == twoStep)
				return true;
		}
		return false;
	}

}
