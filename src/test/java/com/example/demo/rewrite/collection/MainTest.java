package com.example.demo.rewrite.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		List<String> listt = new ArrayList<>();
//		SList<String> list = new SArrayList<>();
//		list.add("1");
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
//		list.add("6");
//		list.add("7");
//		System.out.println(list.size());
//		list.remove(0);
//		list.remove(2);
//		list.remove(5);
//		System.out.println(list.size());
//		
//		for (int i =0 ; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}

		
//		List<String> lklistt = new LinkedList<>();
//		SLinkedList<String> lklist = new DSLinkedList<>();
//		
//		lklist.addFirst("s1");
//		lklist.addFirst("s2");
//		lklist.addFirst("s4");
//		lklist.addLast("s3");
//		System.out.println(lklist.size());
//		System.out.println(lklist.get(0));
//		lklist.printAll();
//		lklist.removeAt(1);
//		lklist.removeFirst();
//		lklist.removeLast();
//		lklist.printAll();
		
		SHashTable<String, String> hashes =  new SIHashTable<String, String>();
		hashes.put("1", "a");
		hashes.put("4", "6");
		System.out.println(hashes.get("1"));
		System.out.println(hashes.get("4"));
		
	}

}
