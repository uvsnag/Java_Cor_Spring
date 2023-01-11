package com.example.demo.rewrite.collection;

public interface SHashTable<K,V> {
	int size();
	boolean isEmpty();
	void put(K key, V value);
	boolean remove(K key);
	V get(K key);
}
