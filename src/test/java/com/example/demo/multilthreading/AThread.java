package com.example.demo.multilthreading;

//public class AThread  implements Runnable  {
	public class AThread extends Thread {
	
	public String name;
	
	public AThread(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println();
		for (int x = 1; x <= 3; x++) {
			System.out.println(x + this.name +":"+ Thread.currentThread().getName());
		}
	}
}
