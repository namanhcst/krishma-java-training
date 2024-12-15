package com.learning.java;



class Parent
{
		public void property(){
			System.out.println("cash+land+gold");
		}
		 static Animal marry() {  //protected 
			System.out.println("XYZ");
			//int i = 10/0;  //Arithmatic exception
			return null;
		}
}

class Child extends Parent {
		
		 static Animal marry() {  //default
			System.out.println("ABC");
			return null;
		}
}


class Overrid{
	
	public static void main(String[] args) {
		
		Parent p = new Child();
		p.marry();
		
			}
}


class Animal{}


class Monkey extends Animal{
	
}