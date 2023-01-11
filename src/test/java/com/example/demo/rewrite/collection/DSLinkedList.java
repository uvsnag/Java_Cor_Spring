package com.example.demo.rewrite.collection;

public class DSLinkedList<T> implements SLinkedList<T>{

	private Node<T> tail = null;
	private Node<T> head = null;
	private int size = 0;
	@Override
	public int size() {
		return size;
	}
	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	@Override
	public boolean addFirst(T e) {
		if(isEmpty()) {
			tail = head = new Node<T>(e, null, null);
		}else {
			Node<T> node  = new Node<T>(e, null, head);
			head.setPrev(node);
			head = node;
		}
		size++;
		return true;
	}
	@Override
	public boolean addLast(T e) {
		if(isEmpty()) {
			tail = head = new Node<T>(e, null, null);
		}else {
			Node<T> node  = new Node<T>(e, tail, null);
			tail.setNext(node);
			tail = node;
		}
		size++;
		return true;
	}
	@Override
	public boolean removeFirst() {
		Node<T> temp = head.getNext();
		temp.setPrev(null);
		head.setNext(null);
		head = temp;
		size--;
		return true;
	}
	@Override
	public boolean removeLast() {
		Node<T> temp = tail.getPrev();
		temp.setNext(null);
		tail.setPrev(null);
		tail = temp;
		size--;
		return true;
	}
	@Override
	public T get(int o) {
		int i = 0;
		Node<T> next = head;
		while(i<size) {
			if(i == o) {
				return next.getData();
			}
			i++;
			next = next.getNext();
		}
		throw new IllegalArgumentException("out of range.");
	}
	@Override
	public void printAll() {
		System.out.println("====printing...==");
		int i =0;
		Node<T> next  = head;
		while(i<size) {
			System.out.println(next.getData());
			next = next.getNext();
			i++;
		}
		
	}
	@Override
	public boolean removeAt(int o) {
		int i = 0;
		Node<T> next = head;
		while(i<size) {
			if(i == o) {
				next.getPrev().setNext(next.getNext());
				next.getNext().setPrev(next.getPrev());
				next.setNext(null);
				next.setPrev(null);
				size--;
				return true;
			}
			i++;
			next = next.getNext();
		}
		throw new IllegalArgumentException("out of range.");
	}

}
