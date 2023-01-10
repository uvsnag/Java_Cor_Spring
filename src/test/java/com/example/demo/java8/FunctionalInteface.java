package com.example.demo.java8;



public class FunctionalInteface {
	public static void main(String[] args) {
		Functiontest fc = new Functiontest();
		fc.print();
	}
}

class Functiontest{
	public void print() {
		print2(new GetNumber(){
			@Override
			public int getAnyNumber(int n) {
				return n;
			}
		});
	}
	
	public void print2(GetNumber functions) {
		System.out.println("number:"+ functions.getAnyNumber(0));
	}
}

//just one method except default, static, private, and method is implemented from parents class
@FunctionalInterface
interface GetNumber {
	int getAnyNumber(int n);
}