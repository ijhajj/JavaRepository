package objProg;

public class Account {
	private int accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private int phoneNumber;
	public Account() {
		this(12345667,4390,"Default Name","Default Email",1234567);
		System.out.println("Empty Constructor");
	}
	public Account(int accountNumber,double balance,String customerName,String email,int phoneNumber) {
		System.out.println("Parameterized Constructor");
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void depositFunds(double amount) {
		this.balance +=amount;
		System.out.println("Amount " +  amount + " added to your account");
		System.out.println("Current balance in your account is " +  this.balance);
	}
	public void withdrawFunds(double amount) {
		if (this.balance>=amount) {
			this.balance -=amount;
			System.out.println("Amount " + amount + " Withdrawn from your account");
			System.out.println("Current balance in your account is : " + this.balance);
		}else {
			System.out.println("Insufficient Funds!");
		}
	}
}
