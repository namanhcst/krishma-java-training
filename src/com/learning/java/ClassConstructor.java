package com.learning.java;

public class ClassConstructor {
	
	int m=10;
	static int s = 100;
	
	ClassConstructor(int var1){
		
	}
	
	
	
	void m1() {
	System.out.println(s);	
	}
	
	
	
	public static void main(String[] args) {
		
		Admin a = new Student();
		
		//A b = (C) d;
		Student s=(Student) a;  
		
		
		Object o = new StringBuffer();
		
		String s1=(String) o;
		
		
		//String s = new StringBuffer();
		

		
		
	}

}
  