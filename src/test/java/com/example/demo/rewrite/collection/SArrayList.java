package com.example.demo.rewrite.collection;


public class SArrayList<E> implements SList<E>  {

	private int count = 0;
//	private int capacity = 0;
//	private static final int DEFAULT_CAPACITY = 10;
	private static final int DEFAULT_CAPACITY = 3;
//	private static final Object[] DEFAULT_ARR_INIT = {};
	E[] elementArr;
	
//	SArrayList(){
//		elementArr = DEFAULT_ARR_INIT;
//	}
	@Override
	public int size() {
		if(elementArr == null || elementArr.length == 0) {
			return 0;
		}
		return count;
	}

	@Override
	public boolean isEmpty() {
		if( size() == 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean add(E e) {
		if(size()<= count+1) {
			E[] temp = elementArr;
			elementArr = (E[]) new Object[count+DEFAULT_CAPACITY];
			for(int i = 0; i< size(); i++) {
				elementArr[i] = temp[i];
			}
			elementArr[count++] = e;
			return false;
		}
		
		return false;
	}

	@Override
	public boolean remove(int o) {
		if(o>=size() || o<0) {
			return false;
		}
		int i = o;
		while(i<count-1) {
			elementArr[i] = elementArr[i+1];
			i++;
		}
		elementArr[count-1] = null;
		count --;
		return true;
	}

	@Override
	public E get(int o) {
		if(o>=size() || o<0) {
			throw new IllegalArgumentException("exception here .....");
		}
		
		return elementArr[o];
	}


}
