package LeetCode;

public class ConvertSortedListToBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode sortedListToBST(ListNode head) {
		return rec(head, null);
	}

	public TreeNode rec(ListNode start, ListNode end) {
		if (start == end) {
			return null;
		}

		ListNode mid = start;
		ListNode probe = start;
		while (probe != end && probe.next != end) {
			mid = mid.next;
			probe = probe.next.next;
		}
		TreeNode root = new TreeNode(mid.val);
		root.left = rec(start, mid);
		root.right = rec(mid.next, end);
		return root;

	}

}
