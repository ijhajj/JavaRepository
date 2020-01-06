package objProg;

public class LambdaAnonymous {
	static public void main(String args[]) {
	Employee e = ()->System.out.println("Employee Name");
}
}
interface Employee{
	void printName();
}
