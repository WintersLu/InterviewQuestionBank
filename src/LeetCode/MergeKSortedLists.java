package LeetCode;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class PQsort implements Comparator<ListNode> {
		public int compare(ListNode a, ListNode b) {
			if (a.val > b.val) return 1;
			else if(a.val == b.val) return 0;
			else return -1;
		}
	}

	public ListNode mergeKLists(List<ListNode> lists) {
		if(lists == null || lists.size()==0) return null;
		
		PQsort sort = new PQsort();
		PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.size(), sort);
		for(ListNode oneList : lists){
		    if(oneList != null)
		        pq.offer(oneList);
		}
		
		ListNode point = new ListNode(0);
		ListNode result = point;
		while(!pq.isEmpty()){
			ListNode out = pq.poll();
			if(out.next != null) pq.offer(out.next);
			
			point.next = out;
			point = point.next;
		}
		
		return result.next;
	}

}
