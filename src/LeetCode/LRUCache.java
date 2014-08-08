package LeetCode;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class LRUCache {
    
    private int maxSize;
    private HashMap<Integer, Integer> map;
    private Queue<Integer> queue;
    
    public static void main(String[] args) {
    	LRUCache lru = new LRUCache(2);
    	lru.set(2, 1);
    	lru.set(1, 1);
    	lru.get(2);
    	lru.set(4, 1);
    	lru.get(1);

	}
    
    
    public LRUCache(int capacity) {
        maxSize = capacity;
        map = new HashMap<Integer, Integer>(maxSize);
        queue = new LinkedList<Integer>();
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
        	queue.remove(key);
        	queue.add(key);
            return map.get(key);
        }
        return -1;
    }
    
    public void set(int key, int value) {
        if(map.containsKey(key)){
            queue.remove(key);
        }
        
        while(queue.size() >= maxSize) {
            map.remove(queue.poll());
        }
        queue.add(key);
        map.put(key, value);
    }
}
