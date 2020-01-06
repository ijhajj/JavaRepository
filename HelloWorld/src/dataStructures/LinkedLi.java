package dataStructures;
import java.util.ArrayList;

public class LinkedLi {

	public static void main(String[] args) {
		Customers cust1 = new Customers("Tim",54.96);
		Customers cust2 = new Customers("Henry",10.91);
		Customers anotherCust;
		anotherCust = cust1;
		anotherCust.setBalance(100.01);
		System.out.println("Balance for customer " + cust1.getName() +"is " + cust1.getBalance());
		System.out.println("Balance for another customer " + anotherCust.getName() + "is " + anotherCust.getBalance());
		//ArrayList
		ArrayList<Integer> arrL1 = new ArrayList<Integer>();
		for (int i=0;i<10;i++) {
			arrL1.add(Integer.valueOf(i));
		}
		ArrayList<Integer> arrL2=arrL1;
		System.out.println(arrL1.get(1));
		arrL1.set(1, Integer.valueOf(30));
		System.out.println("arrL1 :" + arrL1.get(1) + " arrL2.get(1) :" + arrL2.get(1));
		System.out.println(arrL1.toString());
		arrL1.remove(5);
		
		for(int i=0;i<arrL1.size();i++) {
			System.out.println("arrL1 at index : " + i + " is : " + arrL1.get(i));
		}
	}

}
class Customers{
	private String name;
	private double balance;
	public Customers(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
