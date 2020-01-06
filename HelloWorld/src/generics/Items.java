package generics;
import java.util.ArrayList;

public class Items {
	public static void main(String[]args) {
		//This is the use of generics as we are not mentioning what type of Object is being stored inside the ArrayList
		//Thus the error is not getting caught by the compiler
		//ArrayList<Integer> items = new ArrayList<Integer>();
		//ArrayList<Integer> i = new ArrayList<>(); <-- works above 1.5 version
		//Above type of declaration would have helped compiler to complain
		ArrayList items = new ArrayList();
		items.add(1);
		items.add(2);
		items.add(3);
		items.add(4);
		items.add(5);
		//This error is not being caught by the compiler
		//items.add("IP");
		
		printItems(items);
		
		
	}
	private static void printItems(ArrayList items) {
		for(Object item:items) {
			System.out.println((Integer)item*2);
		}
	}

}
