package com.example.demo.generic;

import java.util.ArrayList;
import java.util.List;

public class Generic {
	public static void main(String[] args) {
		
		List<? extends Number> lis =  new ArrayList<>();
	}
	
	static <E> void printList(List<E> arr) {
		for(E el: arr) {
			System.out.println("ele");
		}
		
	}
}