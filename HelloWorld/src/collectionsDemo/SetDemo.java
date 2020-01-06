package collectionsDemo;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String...args) {
	Set<Integer> intSet = new HashSet<>();
	intSet.add(85);
	intSet.add(92);
	intSet.add(87);
	intSet.add(34);
	intSet.add(59);
	intSet.add(62);
	
	for(int x:intSet) {
		System.out.println(x);
	}
	System.out.println("Tree Set Auto Sorts");
	Set<Integer> intTreeSet = new TreeSet<>();
	intTreeSet.add(85);
	intTreeSet.add(92);
	intTreeSet.add(87);
	intTreeSet.add(34);
	intTreeSet.add(59);
	intTreeSet.add(62);
	intTreeSet.add(62);
	
	for(int x:intTreeSet) {
		System.out.println(x);
	}
	}
}
