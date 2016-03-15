package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class NewLRU {
	
	class DoublyLinkedListNode {
		DoublyLinkedListNode prev;
		DoublyLinkedListNode next;
		int key;
		int val;

		DoublyLinkedListNode(int key, int val) {
			this.key = key;
			this.val = val;
		}
	}

	private Map<Integer, DoublyLinkedListNode> map = new HashMap<Integer, DoublyLinkedListNode>();
	private DoublyLinkedListNode head = null;
	private int capacity;

	// Detach the given node from the list.
	private void detach(DoublyLinkedListNode node) {
		// A corner case for detach.
		if (node == this.head)
			this.head = node.next;
		node.prev.next = node.next;
		node.next.prev = node.prev;
	}

	// Attach the given node to the beginning of the list.
	private void attach(DoublyLinkedListNode node) {
		if (this.head != null) {
			DoublyLinkedListNode last = this.head.prev;
			this.head.prev = node;
			node.next = this.head;

			last.next = node;
			node.prev = last;
		} else {
			node.next = node;
			node.prev = node;
		}

		this.head = node;
	}

	public NewLRU(int capacity) {
		assert (capacity > 0);
		this.capacity = capacity;
	}

	public int get(int key) {
		if (map.containsKey(key)) {
			// Refresh the list.
			DoublyLinkedListNode node = map.get(key);
			detach(node);
			attach(node);
			return node.val;
		} else {
			return -1;
		}
	}

	public void set(int key, int value) {
		if (!map.containsKey(key)) {
			// If the capacity is reached, remove the last node and its
			// corresponding key-value pair.
			if (map.size() == this.capacity) {
				DoublyLinkedListNode last = this.head.prev;
				detach(last);
				map.remove(last.key);
			}

			// Add a new node and its corresponding key-value pair.
			DoublyLinkedListNode newHead = new DoublyLinkedListNode(key, value);
			attach(newHead);
			map.put(key, newHead);
		} else {
			// Update the value.
			DoublyLinkedListNode newHead = map.get(key);
			newHead.val = value;

			// Refresh the list.
			detach(newHead);
			attach(newHead);
		}
	}

}
