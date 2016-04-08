package com.lxk.test;

@TestInterface(value = "abc")
public class HelloWorld {
	
	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		t(new HelloWorld());
		Tlk tlk = new Tlk(null, null);
	}
	
	
	private static void t(HelloWorld helloWorld){
		TestInterface testInterface = helloWorld.getClass().getAnnotation(TestInterface.class);
		System.out.println(testInterface.value());
	}
}
