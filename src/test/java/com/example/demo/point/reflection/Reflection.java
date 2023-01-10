package com.example.demo.point.reflection;

public class Reflection {
	public static void main(String[] args) {
//		Simple Simple = new Simple();
//		Demo Demo = new Demo();
//		Demo.print(Simple);
//		
//
		Class c = Simple.class;
		System.out.println(c.getName());
		System.out.println(c.isInterface());
		
		
//		Class c;
//		try {
//			c = Class.forName("com.example.demo.point.reflection.Simple");
//			System.out.println(c.getName());    
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}    
		
	}

}
class Simple{
	private void printi() {
		System.out.println("hello world");
	
	}
}  

