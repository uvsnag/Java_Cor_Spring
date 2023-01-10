package com.example.demo.point.reflection;

public class Demo {

	void print(Object obj) {
		Class c = obj.getClass();
		System.out.println(c.getName());
	}
}
