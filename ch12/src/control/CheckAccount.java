package control;

import access.Account;
import access.SavingAccount;

public class CheckAccount extends Account {
	long minimum;
	
	public CheckAccount(String name, int number, long minimum) {
		super(name, number);
		this.minimum = minimum;
		super.deposit(minimum);
	}
	/*
	public static void main(String[] args) {
		SavingAccount SavingAccount = new SavingAccount("김지우", 91384791, 0.34);
		Account myAccount;
		myAccount.withdraw(50000);
		myAccount.checkBalance();
		
		System.out.println(myAccount.name);
		System.out.println(myAccount.open);
		System.out.println(myAccount.number);
		System.out.println(myAccount.balance);
		
		CheckAccount ca = new CheckAccount("기미중", 123456789, 500000)
		System.out.println(ca.name);
		System.out.println(ca.open);
		System.out.println(ca.number);
		System.out.println(ca.balance);
		
	}
	*/
}
