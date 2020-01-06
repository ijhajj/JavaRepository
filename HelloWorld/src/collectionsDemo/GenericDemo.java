package collectionsDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class GenericDemo {

	public static void main(String[] args) {
		//missing on type safety as we can add any type of object in the list created
		List values = new ArrayList();
		values.add(1);
		values.add("Name");
		values.add(5.0f);
		
		//String i = values.get(1).toString();
		//int val = Integer.parseInt(i);// No compile time error, but results in run time exception, as the value is a String
		
		
		//Thus, the usage of Generics
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		//numbers.add("Name");//<-- Compiler complains -->
		
		Collection cVal = new ArrayList();
		cVal.add(10);
		cVal.add("IP");
		cVal.add(50.02f);
		
		//iterating through the Collection
		//using iterator - Old way of doing things
		Iterator i = cVal.iterator();
		while(i.hasNext()) {
		System.out.println(i.next());
		}
		System.out.println("**** Advanced for loop *****");
		//Advanced for loop
		for (Object val:cVal) {
			System.out.println(val);
		}
		System.out.println("*** Lambda Exp ***");
		cVal.forEach(System.out::println);
	}

}
