package com.example.demo.rewrite.collection;


public class SArrayList<E> implements SList<E>  {

	private int count = 0;
	private static final int DEFAULT_CAPACITY = 10;
	Object[] elementArr;
	
	@Override
	public int size() {
		if(elementArr == null || elementArr.length == 0) {
			return 0;
		}
		return elementArr.length;
	}

	@Override
	public boolean isEmpty() {
		if( size() == 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean add(Object e) {
		if(isEmpty() || size()+1> count) {
			Object[] temp = elementArr;
			elementArr = new Object[count+DEFAULT_CAPACITY];
			if(!isEmpty() ) {
				for(int i = 0; i< size(); i++) {
					elementArr[i] = temp[i];
				}
			}
		}
		elementArr[count] = e;
		count++;
		return false;
	}

	@Override
	public boolean remove(int o) {
		if(o>=size() || o<0) {
			return false;
		}
		int i = o;
		int length =  elementArr.length;
		while(i<length-1) {
			elementArr[i] = elementArr[i+1];
			i++;
		}
		return true;
	}

	@Override
	public Object get(int o) {
		if(o>=size() || o<0) {
			throw new IllegalArgumentException("exception here .....");
		}
		
		return elementArr[o];
	}


}
