package LeetCode;

public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode sortList(ListNode head) {
		return mergeSort(head);
	}
	
	public ListNode mergeSort(ListNode head){
		if(head == null || head.next == null)
			return head;
		ListNode slow = head;
		ListNode fast = head;
		while(fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode first = head;
		ListNode second = slow.next;
		slow.next = null;
		first = mergeSort(first);
		second = mergeSort(second);
		return merge(first, second);
		
	}
	
	public ListNode merge(ListNode node1, ListNode node2){
		ListNode helper = new ListNode(0);
		helper.next = node1;
		ListNode pre = helper;
		while(node1 != null && node2 != null){
			if(node1.val < node2.val){
				node1 = node1.next;
			}else{
				ListNode next = node2.next;
				node2.next = pre.next;
				pre.next = node2;
				node2 = next;
			}
			pre = pre.next;
		}
		if(node2!= null){
			pre.next = node2;
		}
		return helper.next;
	}

}
