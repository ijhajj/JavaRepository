package objProg;

public class InnerClasses {
	public static void main(String[] args) {
		A1 objA = new A1();
		objA.i=5;
		
		A1.B objB =  objA.new B();
		objB.j = 10;
	}

}

class A1{
	int i;
	class B{
		int j;
	}
}
