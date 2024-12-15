package test;

import java.util.RandomAccess;

interface A{
int x = 10;

void m1();
}

interface B {
	
	int x=20;
	void m1();

}

public class RBI implements A,B,RandomAccess{
	
	public static void main(String[] args) {
		
		RBI r = new RBI();
		
		System.out.println(r instanceof A);
		
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
}