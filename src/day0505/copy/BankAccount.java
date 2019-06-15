package day0505.copy;

public class BankAccount {
String accountHolder;
double balance;

public void showBalance() {
	System.out.println("Your balance is: "+ balance);
}

public void showAccountHolder () {
	System.out.println("Account holder name is: "+ accountHolder);
}
public void add100Dollars() {
	balance = balance+100;
}
public void addDollar(int amout) {
balance = balance + amout;
}
}
