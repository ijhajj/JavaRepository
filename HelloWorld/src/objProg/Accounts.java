package objProg;

import java.util.ArrayList;

public class Accounts {
	private String accountName;
	private int balance;
	private ArrayList<Integer> transactions;
	
	public Accounts(String accountName) {
		this.accountName =  accountName;
		this.transactions = new ArrayList<>();
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public void deposit(int amount) {
		if(amount>0) {
			transactions.add(amount);
			this.balance += amount;
			System.out.println(amount + " deposited, balance : " + getBalance());
		}else {
			System.out.println("cannot deposit negative amounts");
		}
	}
	
	public void withdrawl(int amount) {
		int withdrawl = -amount;
		if(withdrawl < 0) {
			transactions.add(withdrawl);
			this.balance += withdrawl;
			System.out.println(amount + " withdrawn, balance : " + this.getBalance());
		}else {
			System.out.println("cannot withdraw a negative amount");
		}
	}
	
	public void calculateBalance() {
		this.balance = 0;
		for(int i: this.transactions) {
			this.balance += i;
		}
		System.out.println("Calculated balance is " + this.balance);
	}
	
}
