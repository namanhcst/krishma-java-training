package test;

public interface TestI {
	
		int s=10;
	
		void m1();
	

}

 interface TestI2 {
	
	int s1=10;

	void m2();


}
 
 interface TestI3 extends TestI2,TestI {
		
		int s1=10;

		//final static protected 
		 final void m2();


	}
 
 class B{
	 
	 
 }
 
 
 class C{
	 
	 
 }


class A extends B implements TestI,TestI2{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
	
}