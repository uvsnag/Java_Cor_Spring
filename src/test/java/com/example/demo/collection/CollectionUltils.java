package com.example.demo.collection;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CollectionUltils {
	
	public void test() {
		java.util.List<String> arrL = new ArrayList<>(5);
		arrL.add("a");
		arrL.add("c");
		arrL.add("b");
		arrL.add("d");
		arrL.add("c");
		
		MemberDto MemberDto = new MemberDto(1, "s");
		
		System.out.println(MemberDto.getId()+MemberDto.getName());
		setNullObj(MemberDto);
		
		System.out.println(MemberDto.getId()+MemberDto.getName());
	}
	
	public <E> void setNull( java.util.Collection<E> arr) {
		arr.add((E) "ds");
				
	}
	public void setNullObj( MemberDto arr) {
		arr.setId(8);;
	}
	public <E> void printColl( java.util.Collection<E> arr) {
		
		for(E item : arr) {
			System.out.print(item+", ");
		}
	}
	public <E> void printCollIterator( java.util.Collection<E> arr) {
		
		java.util.Iterator<E> itr = arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	public <E> void printCollSet( java.util.Collection<E> set) {
		
		java.util.Iterator<E> itr=set.iterator();  
	    while(itr.hasNext()){  
	        //Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry=(Map.Entry)itr.next();  
//	        System.out.println(entry.getKey().hashCode()+" "+entry.getValue().hashCode());  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	    }  
		
	}
}
