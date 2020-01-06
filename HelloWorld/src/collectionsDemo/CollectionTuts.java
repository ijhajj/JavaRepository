package collectionsDemo;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionTuts {

	public static void main(String[] args) {
		List<Student> studList = new ArrayList<>();
		studList.add(new Student("Henry",1101987));
		studList.add(new Student("Henry2",1101988));
		studList.add(new Student("Henry3",1101989));
		studList.add(new Student("Henry4",1101981));
		studList.add(new Student("Henry5",1101982));
		studList.add(new Student("Henry6",1101983));
		
		
		Collections.sort(studList,(s1,s2)->{
			return (s1.rollNo>s2.rollNo?-1:0);
			//return (s1.rollNo>s2.rollNo?-1:s1.rollNo<s2.rollNo?1:0);
		});
		for (Student student:studList) {
			System.out.println(student);
		}
	}

}
class Student{
	String name;
	int rollNo;
	
	public Student(String name,int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
	public String toString() {
		return "Student " + name + " has rollNo " + rollNo;
	}
}