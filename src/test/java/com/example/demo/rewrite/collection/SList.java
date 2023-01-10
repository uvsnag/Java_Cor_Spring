package com.example.demo.rewrite.collection;

public interface SList<E> {

	int size();
	boolean isEmpty();
	boolean add(E e);
	boolean remove(int o);
	Object get(int o);
	
}
