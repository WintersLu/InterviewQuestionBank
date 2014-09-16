package Linkedin;

import java.util.LinkedList;

public class HashMap {

	private class HashEntry {
		private Object key;
		private Object data;

		public HashEntry() {
			this.key = null;
			this.data = null;
		}

		public HashEntry(Object key, Object data) {
			this.key = key;
			this.data = data;
		}

		public Object getKey() {
			return key;
		}

		public void setKey(Object key) {
			this.key = key;
		}

		public Object getData() {
			return data;
		}

		public void setData(Object data) {
			this.data = data;
		}
		
		@Override
		public boolean equals(Object obj){
			if(obj instanceof HashEntry) {
				HashEntry entry = (HashEntry)obj;
				return this.key.equals(entry.getKey());
			}
			return false;
		}
		
		@Override
		public String toString(){
			return "";
		}
	}
	
	/**
	 * Table part
	 */
	private final int tableSize = 32;
	private int numElements;
	private Object[] table;
	
	private int hash(Object key){
//		int result = 1;
		return key.hashCode();
	}
	
	@SuppressWarnings("unchecked")
	public void put(Object key, Object data){
		if(key == null || data == null){
			return;
		}
		int pos = hash(key) % this.tableSize;
		if(this.table[pos] == null){
			this.table[pos] = new LinkedList<HashEntry>();
		}
		((LinkedList<HashEntry>)this.table[pos]).add(new HashEntry(key, data));
		this.numElements++;
	}

	@SuppressWarnings("unchecked")
	public boolean contains(Object key){
		boolean result = false;
		int pos = this.hash(key) % this.tableSize;
		if(this.table[pos] != null){
			HashEntry entry = new HashEntry();
			entry.setKey(key);
			if(((LinkedList<HashEntry>)this.table[pos]).indexOf(entry) > -1){
				result = true;
			}
		}
		return result;
	}

}
