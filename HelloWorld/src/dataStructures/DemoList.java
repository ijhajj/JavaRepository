package dataStructures;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class DemoList {
	public static void main(String[] args) {
		LinkedList<String> placesToVisit = new LinkedList<String>();
		addInOrder(placesToVisit,"Agra");
		addInOrder(placesToVisit,"Melbourne");
		addInOrder(placesToVisit,"Britain");
		addInOrder(placesToVisit,"London");
		addInOrder(placesToVisit,"Canada");
		addInOrder(placesToVisit,"Algeria");
		printList(placesToVisit);
		addInOrder(placesToVisit,"Canada");
		addInOrder(placesToVisit,"Belgium");
		printList(placesToVisit);
		visit(placesToVisit);
		
		//placesToVisit.add(1, "Bathinda");
		//printList(placesToVisit);
		
		//placesToVisit.remove(4);
		//printList(placesToVisit);
	}
	public static void printList(LinkedList<String> placesToVisit) {
		Iterator<String> i = placesToVisit.iterator();//Allows fetching - no modifications
		while(i.hasNext()) {
			System.out.println("Now visiting : " + i.next());
			
		}
		System.out.println("Again **********");
	}
	//Method will add the cities in alphabetic order
	private static boolean addInOrder(LinkedList<String> linkedl,String newCity) {
		ListIterator<String> stringListIter = linkedl.listIterator();//Allows modification
		while(stringListIter.hasNext()) {
			//compares the value at the iterator to the value passed
			//0: is equal to the value passed
			int comparison = stringListIter.next().compareTo(newCity);
			if(comparison==0) {//the element already exists
				System.out.println(newCity+" was already added");
				return false;
			}else if(comparison > 0) {//element will be added before this element
				stringListIter.previous();//move back one step
				stringListIter.add(newCity);
				return true;
			}
		}
		stringListIter.add(newCity);//in all other conditions new element needs to be added at the end of the list
		return true;
	}
	private static void visit(LinkedList<String> cities) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true; //Will track which direction we are going
		ListIterator<String> iter = cities.listIterator();
		if (cities.isEmpty()) {
			System.out.println("No cities in the itenary");
			scanner.close();
			return;
		}else {
			System.out.println("Now visiting " + iter.next());
			printMenu();
		}
		while(!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			switch(action) {
			case 0:
				System.out.println("Holiday (vacation) over!!!");
				quit=true;
				break;
			case 1:
				if (!forward) {
					if(iter.hasNext()) {
						iter.next();
					}
					forward=true;//set we are going forward
				}
				if(iter.hasNext()) {
					System.out.println("Now visiting " + iter.next());
				}else {
					System.out.println("Reached the end of the list");
					forward=false;
				}
				break;
			case 2:
				if(forward) {
					if(iter.hasPrevious()) {
						iter.previous();// this is an extra step that will allow us not to print same node once direction changes
					}
					forward=false;
				}
				if(iter.hasPrevious()) {
					System.out.println("Now visiting " + iter.previous());
				}else {
					System.out.println("We are at the start of the list");
					forward=true;
				}
				break;
			default:
				printMenu();
				break;
		}
	}
		scanner.close();
	}
		private static void printMenu() {
			System.out.println("Available actions:\n press ");
			System.out.println("0 - to quit\n" + 
							"1 - Go to next city\n" +
							"2 - Go to previous city\n" +
							"Other - print menu options");
			System.out.println();
		}

}
