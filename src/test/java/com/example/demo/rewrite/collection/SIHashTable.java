package com.example.demo.rewrite.collection;

public class SIHashTable<K,V> implements SHashTable<K,V> {

	private DSLinkedList<NodeHash<K,V>>[] table;
	private int size;
	private static final int DEFAULT_CAPACITY = 10;
	private int capacity = 0;
	
	@Override
	public int size() {
		return size;
	}

	public SIHashTable() {
		this.capacity = DEFAULT_CAPACITY;
		table = new DSLinkedList[capacity];
	}

	@Override
	public boolean isEmpty() {
		return size==0;
	}

	@Override
	public void put(K key, V value) {
		int index = hashCodeToIndex(key.hashCode());
		DSLinkedList<NodeHash<K,V>> bucket =  table[index];
		if(bucket == null) {
			table[index] = bucket = new DSLinkedList<NodeHash<K,V>>();
			addNode(key, value, bucket);
		}else if(bucket.isEmpty()) {
			addNode(key, value, bucket);
		}else {
			for(int i = 0; i<bucket.size(); i++) {
				if(bucket.get(i).getKey().equals(key)) {
					bucket.get(i).setValue(value);
					return;
				}
			}
			addNode(key, value, bucket);
		}
	}
	private int hashCodeToIndex(int hashcode) {
		return (int) (hashcode & 0xFFFFFFFFFL)% capacity;
		
	}

	private void addNode(K key, V value, DSLinkedList<NodeHash<K,V>> bucket ) {
		if(++size>=capacity) {
			capacity *=2;
			DSLinkedList<NodeHash<K,V>>[] temp = table;
			table = new DSLinkedList[capacity];
			for(int i=0; i<temp.length; i++) {
				table[i] = temp[i];
			}
		}
		NodeHash<K,V> node = new NodeHash<K,V>(key, value);
		bucket.addLast(node);
	}
	@Override
	public boolean remove(K key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V get(K key) {
		int index = hashCodeToIndex(key.hashCode());
		DSLinkedList<NodeHash<K,V>> bucket =  table[index];
		for(int i=0; i<bucket.size(); i++) {
			if(bucket.get(i).getKey().equals(key)){
				return bucket.get(i).getValue();
			}
		}
		return null;
	}

}
