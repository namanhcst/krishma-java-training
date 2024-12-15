package com.learning.java;

abstract class Admin{
	
	int x = 100;
	
	Admin(){	
		System.out.println("I am supper class parameterized constructor");
	}
	
	
}

public class Student extends Admin{
	
	 int rollnumber;
	 String name;
	 static String collegeName;
	
	 
	 {
		System.out.println("inside instace block");

		 //instance block
		 //instance + static
		 
	 }
	 
	 static {
			System.out.println("inside static block");

			collegeName="CollegeName";
		 
	 }

	
		Student(){
			
			System.out.println("inside default constructor");
			
		}
		
		void m1() {
			
		}

}
