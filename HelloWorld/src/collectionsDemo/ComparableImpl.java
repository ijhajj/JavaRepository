package collectionsDemo;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ComparableImpl {

	public static void main(String[] args) {
		List<Students> studList = new ArrayList<>();
		studList.add(new Students("Henry",5));
		studList.add(new Students("Henry",1));
		studList.add(new Students("Henry",3));
		studList.add(new Students("Henry",9));
		studList.add(new Students("Henry",6));
		studList.add(new Students("Henry",4));
		Collections.sort(studList);
		for(Students student:studList) {
			System.out.println(student);
		}
	}

}
//implement Comparable interface to define the sorting logic
class Students implements Comparable<Students>
{
	public String name;
	public int RollNo;
	
	public Students(String name,int RollNo) {
		this.name = name;
		this.RollNo = RollNo;
	}
	@Override
	public int compareTo(Students s) {
		return this.RollNo>s.RollNo?1:this.RollNo<s.RollNo?-1:0;
		
		
	}
	public String toString() {
		return "Student name : " + name + " with Roll No : " + RollNo;
	}
}

