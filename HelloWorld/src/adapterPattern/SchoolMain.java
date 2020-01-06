package adapterPattern;

public class SchoolMain {

	public static void main(String[] args) {
		Pen p = new PenAdapter();
		AssignmentWork assignment1 = new AssignmentWork();
		assignment1.setP(p);
		assignment1.writeAssignment("English Assignment");
	}

}
