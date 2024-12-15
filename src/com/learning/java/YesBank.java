package com.learning.java;


interface RBI {
	
	
	void debit(double amount);
	void credit(double amount);
	double getBalance();

	
	
	
}


public class YesBank implements RBI {
	
	
	public String s= null;
	
	private double balance=1000.00;

	@Override
	public void debit(double amount) {
		balance = balance - amount;
	}

	@Override
	public void credit(double amount) {

		balance = balance + amount;

	}

	@Override
	public double getBalance() {
		//validate 
		return balance;
	}

	

}


class TestingApp{
	
	
	public static void main(String[] args) {
		
		YesBank yb = new YesBank();
		
		yb.credit(500.00);
		yb.debit(200.00);
		double bal = yb.getBalance();
		System.out.println(bal);
		
	}
	
	
	
}