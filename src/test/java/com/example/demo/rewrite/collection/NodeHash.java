package com.example.demo.rewrite.collection;

public class NodeHash<K,V> {
	private int hash;
	private K key;
	private V value;
	
	public int getHash() {
		return hash;
	}
	public void setHash(int hash) {
		this.hash = hash;
	}
	public K getKey() {
		return this.key;
	}
	public void setKey(K key) {
		this.key= key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	public NodeHash(K key, V value) {
		this.value = value;
		this.key = key;
		this.hash = key.hashCode();
	}
	
}
