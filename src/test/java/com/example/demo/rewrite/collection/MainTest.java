package com.example.demo.rewrite.collection;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		SList<String> list = new SArrayList<>();
		list.add("sadsa");
		
		for (int i =0 ; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		

	}

}
