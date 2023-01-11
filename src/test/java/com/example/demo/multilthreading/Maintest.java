package com.example.demo.multilthreading;

public class Maintest {

	public static void main(String[] args) {
	
		int[][] arr = new int[4][5];
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		test t = new test();
		t.change(arr);
		System.out.println(arr[0][0]);
		
//		for(int i=0; i<4)
	}
}
