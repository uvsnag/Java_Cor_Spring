package com.example.demo.rewrite.collection;

public interface SLinkedList<E> {

	int size();
	boolean isEmpty();
	boolean addFirst(E e);
	boolean addLast(E e);
	boolean removeFirst();
	boolean removeLast();
	boolean removeAt(int o);
	E get(int o);
	void printAll();
	
}
