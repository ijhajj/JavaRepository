package collectionsDemo;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ArrayListDemo {
	static public void main(String[] args) {
		//Initializing List at the time of declaration
		List<Integer> values = Arrays.asList(23,15,9);
		//Another way
		List<Integer> valuesList = new ArrayList<Integer>() {//Anonymous Inner Class
			{//Instantiation Initializers
				add(56);
				add(7);
				add(23);
			}
		};
	}
}
