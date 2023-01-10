package com.example.demo.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class Queue {
	public static void main(String[] args) {
		CollectionUltils utils = new CollectionUltils();
//		PriorityQueue<String> arrL = new PriorityQueue <>();
		Deque<String> arrL = new ArrayDeque <>();
		arrL.add("a");
		arrL.add("c");
		arrL.add("b");
		arrL.add("d");
		arrL.add("c");
		
		PriorityQueue<MemberDto> arrL2 = new PriorityQueue <>();
//		arrL2.add(new MemberDto(1, "s"));
//		arrL2.add(new MemberDto(2, "w"));
		
//		System.out.println("head:"+arrL.element());  
//		System.out.println("head:"+arrL.peek()); 
		arrL.remove();  
		arrL.poll(); 
		arrL.pollFirst(); 
		arrL.pollLast(); 
		
		utils.printCollIterator(arrL);

		
		
	}

}
