package week3.day2;

public class Bank extends SBI implements CIBIL,PNB {



	public void creditScore() {
		System.out.println("Credit score : 9.5");
		
	}

	public void minimumBalance() {
		// TODO Auto-generated method stub
		System.out.println("Rs.500");
	}

	public void cibilScore() {
		// TODO Auto-generated method stub
		System.out.println("10");
	}

	@Override
	public void maximumLoanAmount() {
		// TODO Auto-generated method stub
		System.out.println("10lakhs");
	}

	@Override
	public void bankBalance() {
		// TODO Auto-generated method stub
		System.out.println("Rs.20000");
	}
public static void main(String[] args) {
	Bank details = new Bank();
	details.bankBalance();
	details.cibilScore();
	details.creditScore();
	details.maximumLoanAmount();
	details.minimumBalance();
		
	
}
}
