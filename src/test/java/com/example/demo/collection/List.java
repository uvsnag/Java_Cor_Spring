package com.example.demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class List {
	public static void main(String[] args) {
		CollectionUltils utils = new CollectionUltils();
		java.util.List<String> arrL2 = new ArrayList<>();
		java.util.List<String> arrL = new ArrayList<>();
//		LinkedList<String> arrL = new LinkedList<>();
//		java.util.List<MemberDto> arrL = new ArrayList<>();
//		Vector<String> arrL = new Vector<>();
//		Stack<String> arrL = new Stack<>();
		arrL.add("a");
		arrL.add("c");
		arrL.add("b");
		arrL.add("d");
		arrL.add("c");
		
		MemberDto MemberDto = new MemberDto(1, "s");
		
		System.out.println(MemberDto.getId()+MemberDto.getName());
		utils.setNull(arrL);
//		MemberDto.setId(8);;
		System.out.println(MemberDto.getId()+MemberDto.getName());
//		arrL.add(new MemberDto(1, "3"));
//		arrL.add(new MemberDto(3, "3"));
//		
//		Collections.sort(arrL, new MemberComparator());
		utils.printCollIterator(arrL);

	}
}

