package com.example.demo.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.example.demo.dto.EmployeeT;

public class LambdaExpression {
	public static void main(String[] args) {
		LambTest fc = new LambTest();
		fc.test1();
	}
}

class LambTest{
	public void test1() {
		ExpUltils expUltils = new ExpUltils();
		
		//call functional inteface
//		GetAnyNumber a =(r, y)->(r+y);
//		GetAnyNumber a =(r, y)->{
//			return r+y;
//		};
//		System.out.println(a.getAnyNumber(6, 9));
		
		
		//loop
//		List<String> list = List.of("a", "b", "c");
		
		//sort.
		List<EmployeeT> list = new ArrayList<>();
		list.add(new EmployeeT(3, "t"));
		list.add(new EmployeeT(2, "e"));
		list.add(new EmployeeT(1, "e"));
		list.add(new EmployeeT(6, "y"));
//		Collections.sort(list, (a, b)->{
//			return a.getId().compareTo(b.getId());
//		});
		
		//stream
//		Stream<Employee> strE = list.stream().filter(n->n.getName()=="e");
		
//		List<Integer> listInteger =  list.stream()
//				.filter(p->p.getId()>1)
//				.map(p->p.getId())
//				.collect(Collectors.toList());
		
		//Iterating 
		Stream.iterate(2, ele -> ele+1)
		.filter(e ->e%2 == 0)
		.limit(6)
		.forEach(System.out::println);
		
		
		//BiFunction  - Function
//		BiFunction<Integer, Integer, Integer> bif = (x, y)-> x+y;
//		Function<Integer, Integer> fc = (x) -> x+5;
//		System.out.println("result:" +bif.andThen(fc).apply(1, 4));
//		//or
//		Integer a = bif.apply(1, 4);
//		Integer b = fc.apply(a);
//		System.out.println("result:" +b);
		

//		expUltils.printWr(listInteger);
		
	}
}

@FunctionalInterface
interface  GetAnyNumber {
	int getAnyNumber(int i, int y);
}

