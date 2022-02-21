package org.system;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		System.out.println("30000");
	}

	public static void main(String[] args) {
		AxisBank inf = new AxisBank();
		
		inf.deposit();
		

	}

}
