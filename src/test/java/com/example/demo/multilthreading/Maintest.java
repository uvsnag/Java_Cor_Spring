package com.example.demo.multilthreading;

public class Maintest {

	public static void main(String[] args) {
		AThread thread1 = new AThread("Thead 1");
		AThread thread2 = new AThread("Thead 2");
		AThread thread3 = new AThread("Thead 3");
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
