package dataStructures;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();
	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		printInstructions();
		while(!quit) {
			System.out.println("Enter your choice : ");
			choice = scanner.nextInt();
			switch(choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				groceryList.printList();
				break;
			case 2:
				addMenu();
				break;
			case 3:
				modifyMenu();
				break;
			case 4:
				removeMenu();
				break;
			case 5:
				findMenu();
				break;
			default:
				quit = true;
				break;
			}
		}
}

public static void printInstructions() {
	System.out.println("\nPress ");
	System.out.println("\t 0 - To print choice options.");
	System.out.println("\t 1 - To print the list of grocery items");
	System.out.println("\t 2 - To add an item to the grocery list");
	System.out.println("\t 3 - To modify an item from the grocery list");
	System.out.println("\t 4 - To remove an item from the grocery list");
	System.out.println("\t 5 - To find an item in the grocery list");
	System.out.println("\t Choose any other option to quit the menu");
}
public static void addMenu() {
	System.out.println("Enter the Item to be added to the Grocery List");
	groceryList.addItem(scanner.nextLine());
	scanner.nextLine();
}
public static void modifyMenu() {
	System.out.println("Enter the item number to be replaced: ");
	int itemNo = scanner.nextInt();
	scanner.nextInt();
	System.out.println("Enter the new item number that you wish to add in place of the previous one : ");
	String item = scanner.nextLine();
	groceryList.modifyList(itemNo, item);
}
public static void removeMenu() {
	System.out.println("Enter the item number that you wish to remove from the grocery list");
	int itemNo = scanner.nextInt();
	groceryList.removeItem(itemNo);
}
public static void findMenu() {
	System.out.println("Enter the item you wish to locate in the grocery list");
	String item = scanner.nextLine();
	groceryList.findItem(item);
}
}


class GroceryList{
	
	private ArrayList<String> groceryList = new ArrayList<String>();
	
	public void addItem(String item) {
		groceryList.add(item);
	}
	public void printList() {
		System.out.println("Grocery list has " + groceryList.size() + " items in it");
		System.out.println("These are :");
		System.out.println(groceryList.get(0));
		for(int i=0;i<groceryList.size();i++) {
			System.out.println("Here I am");
			System.out.println(groceryList.get(i));
		}
	}
	public void modifyList(int position,String item) {
		groceryList.set(position,item);
		System.out.println("Grocery Item at position " + position + " has been modified");
		
	}
	public void removeItem(int position) {
		String item = groceryList.get(position);
		groceryList.remove(position);
		System.out.println("Grocery item " + item + " at position " + position + " has been removed");
	}
	public int findItem(String item) {
		boolean present = groceryList.contains(item);
		if (present) {
		int position = groceryList.indexOf(item);
		return position;
		}
		return -1;
	}
}
