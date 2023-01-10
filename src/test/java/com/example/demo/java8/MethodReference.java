package com.example.demo.java8;

import java.util.function.BiFunction;

public class MethodReference {
	public static void main(String[] args) {
		
		//Static method
//		Sayable say = MethodReference::saySomething;
//		say.say();
//		BiFunction<Integer, Integer, Integer> bif = Test::add;
//		System.out.println(bif.apply(3, 4));
		
		//Instance Method
//		Test test = new Test();
//		Sayable say = test::print;
//		say.say();
//		BiFunction<Integer, Integer, Integer> bif = test::minus;
//		System.out.println(bif.apply(3, 4));
		
		//Constructor
		
		Messageable msg = Message::new;
		msg.getMessage("hello");
		
	}
	
	public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
}

@FunctionalInterface
interface Sayable{  
    void say();  
}  

class Test{
	void print() {
		System.out.println("dasdsd");
	}
	static int add(int x, int y) {
		return x+y;
	}
	 int minus(int x, int y) {
		return x-y;
	}
}

@FunctionalInterface
interface Messageable{  
    Message getMessage(String msg);  
} 

class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
}  