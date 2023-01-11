package com.example.demo.collection;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;

public class MapT {

	public static void main(String[] args) {
		CollectionUltils utils = new CollectionUltils();
//		Map<Integer, String> map = new HashMap<Integer, String>();
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		map.put(1, "Amit");
		map.put(5, "Rahul");
		map.put(2, "Jai");
		map.put(6, "Amit");
		map.put(2, "rrr");
		map.replace(1, "dsad");

		utils.printCollSet(map.entrySet());
		
		  EnumMap<Days, String> mapm = new EnumMap<Days, String>(Days.class); 
		  mapm.put(Days.MONDAY, "1");  
		  mapm.put(Days.WEDNESDAY, "2"); 
//		  utils.printCollSet(mapm.entrySet());
		  
		  
//		  Properties p = System.getProperties();
//		  utils.printCollSet(p.entrySet());
	}

}
enum Days {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  }