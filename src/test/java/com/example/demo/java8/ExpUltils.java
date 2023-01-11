package com.example.demo.java8;

import java.util.List;

import com.example.demo.dto.EmployeeT;

public class ExpUltils {

	public <T> void printWr(List<T> list) {
		list.forEach((i)->{
			System.out.println(i);
		});
	}
	public  void printOb(List<EmployeeT> list) {
		list.forEach((e)->{
			System.out.println(e.getId()+"-"+ e.getName());
		});
	}
}
