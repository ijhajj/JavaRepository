package dataStructures;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	public static Scanner scanner = new Scanner(System.in);
	public static Bank myBank = new Bank();
	public static ArrayList<Branch> branches = new ArrayList<Branch>();
	
	public static void main(String[] args) {
		boolean quit = false;
		while(!quit) {
			display();
			System.out.println("Enter your choice : ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 0:
				display();
				break;
			case 1:
				addBranch();
				break;
			case 2:
				displayBranches();
				break;
			case 3:
				addCustomer();
				break;
			default:
				quit = true;
				break;
			}
		}

	}
	private static void addBranch() {
		System.out.println("Enter the Branch ID for the new Branch");
		String ID = scanner.nextLine();
		Branch newBranch = new Branch(ID);
		if (findBranch(newBranch)) {
			System.out.println("Branch already present with this ID");
		}else {
			branches.add(newBranch);	
		}
		
	}
	
	private static void displayBranches() {
		for(int i=0; i<branches.size();i++) {
			System.out.println(branches.get(i).getID());
		}
	}
	
	private static boolean findBranch(Branch branch) {
		if(branches.contains(branch)) {
			return true;
		}
		return false;
	}
	
	private static boolean findBranch(String ID) {
		for (int i=0;i<branches.size();i++) {
			if(branches.get(i).getID()==ID) {
				return true;
			}
		}
		return false;
	}
	
	private static void display() {
		System.out.println("Main Menu....");
		System.out.println("\r 0: All options");
		System.out.println("\r 1: Add new Branch");
		System.out.println("\r 2: Display all Branches");
		System.out.println("\r 3: Add customer to the Branch");
	}
	
	
	public static void addCustomer() {
		System.out.println("Enter the name of the branch to which the customer needs to be added");
		String branchID = scanner.nextLine();
		if (findBranch(branchID)) {
			System.out.println("Enter the name of the new Customer");
			String custName = scanner.nextLine();
			System.out.println("Add the initial amount");
			double initAmt = scanner.nextDouble();
			
		}else {
			System.out.println("Branch does not exist");
		}
		
	
		
	}
	public static void transaction() {
		
	}

}

class Branch{
	private String branchID;
	private ArrayList<Customer> customers;
	
	public Branch(String ID) {
		this.branchID = ID;
	}
	
	public String getID() {
		return this.branchID;
	}
	
	public void addNewCustomer() {
		

		
	}
	public void transaction() {
		
	}
	
	public boolean findCustomer(Customer customer) {
		if(customers.contains(customer)) {
			return true;
		}else {
			System.out.println("Customer does not exist");
			return false;
		}
	}
	public boolean findCustomer(String name) {
		for(int i=0;i<customers.size();i++) {
			if(customers.get(i).getName()==name) {
				return true;
			}
		}
		return false;
	}
	
	
	
}

class Customer{
	private String name;
	private ArrayList<Double> transAmtArr;
	
	public Customer(String name,ArrayList<Double> transAmt) {
		this.name = name;
		this.transAmtArr = transAmt;
	}
	public String getName() {
		return this.name;
	}
	public ArrayList<Double> getTransactions(){
		return this.transAmtArr;
	}
	public Customer createNewCustomer(String name,ArrayList<Double> transAmt) {
		return new Customer(name,transAmt);
	}
	
	
}
