package com.example.demo.collection;

import java.util.Comparator;

public class MemberComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		MemberDto d1 = (MemberDto) o1;
		MemberDto d2 = (MemberDto) o2;
		return d1.getId()>d2.getId()?1:0;
	}

}
