package access;

import java.util.Date;

public class Account {
	public String name;
	protected Date open;
	int number;
	private long balance;
	
	
	
	protected Account(String name, int number) {
		this.name = name;
		this.number = number;
		this.open = new Date();
	}
	
	public long deposit(long amount) {
		balance = balance + amount;
		return balance;
	}
	
	public long withdraw(long amount) {
		balance = balance - amount;
		return balance;
	}
	
	public long checkBalance() {
		System.out.println(name + " : 계좌번호 " + number + ", 잔액 " + balance);
		return balance;
	}
}
