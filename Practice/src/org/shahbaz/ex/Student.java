package org.shahbaz.ex;

public class Student {

	private String name;
	private int rolNum;
	private int age;
	
	
	public void setValues(String n, int r, int a) {
		name = n;
		rolNum = r;
		age = a;
	}
	
	public void printMethod() {
		System.out.println("name: "+name);
		System.out.println("rolNum: "+rolNum);
		System.out.println("age: "+age);
	}
}
