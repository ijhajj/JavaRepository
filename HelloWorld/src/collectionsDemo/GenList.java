package collectionsDemo;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class GenList {

	public static void main(String[] args) {
		List values = new ArrayList();
		values.add(10);
		values.add(90);
		values.add(109);
		
		for (Object val:values) {
			System.out.println(val);
		}
		System.out.println("*** Iterate Again ****");
		//add an element at specific index location
		values.add(1,100);
		for (Object val:values) {
			System.out.println(val);
		}
		//We can use Collections class's sort method
		Collections.sort(values);
		System.out.println("**** Sorted List ****");
		for (Object val:values) {
			System.out.println(val);
		}
		//get a specific element at a given index
		System.out.println(values.get(3));
		System.out.println("*** Lambda Expression ****");
		//lambda expression to print values
		values.forEach(System.out::println);
		
	}

}
