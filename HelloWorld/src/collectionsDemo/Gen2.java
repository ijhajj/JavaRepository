package collectionsDemo;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Gen2 {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(129);
		myList.add(288);
		myList.add(565);
		myList.add(437);
		myList.add(123);
		
		//Collections.sort(myList);
		myList.forEach(System.out::println);
		System.out.println("Sorting using comparator");
		Comparator<Integer> comp = new comparatorImplementor(); 
		Collections.sort(myList,comp);
		myList.forEach(System.out::println);
		System.out.println("Sorting based on last digit");
		Comparator comp2 = new comparator2();
		
		Collections.sort(myList,comp2);
		myList.forEach(System.out::println);
	}

}

class comparatorImplementor implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1 > o2) {
			return 1; //means values need to be swapped
		}
		return -1;
	}
	
}
class comparator2 implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1%10 > o2%10) {
			return 1;
		}
		return -1;
	}
	
}
