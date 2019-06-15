package day0505;

public class BankActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount customer1 = new BankAccount();
		customer1.accountHolder = "shah";
		customer1.balance = 10500.50;
		
		customer1.showAccountHolder();
		customer1.showBalance();
		
		customer1.add100Dollars();
		customer1.showBalance();
		customer1.addDollar(50);
		customer1.showBalance();
	
	}

}
