package com.example.demo.collection;

import java.util.EnumSet;
import java.util.Set;
import java.util.TreeSet;

public class SetT {
	public static void main(String[] args) {
		CollectionUltils utils = new CollectionUltils();
//		HashSet<String> arrL = new HashSet <>();
		TreeSet<String> arrL = new TreeSet <>();
		arrL.add("a");
		arrL.add("c");
		arrL.add("b");
		arrL.add("d");
		arrL.add("c");
		
		utils.printCollIterator(arrL.headSet("c"));
		utils.printCollIterator(arrL.tailSet("c"));
		utils.printCollIterator(arrL.subSet("a", "d"));
		
//		utils.printCollIterator(arrL);

//		Set<days> sd = EnumSet.of(days.FRIDAY, days.MONDAY, days.THURSDAY);
//		Set<days> sd = EnumSet.allOf(days.class);
//		utils.printCollIterator(sd);
//		
		
		
	}

}

//enum days {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  }