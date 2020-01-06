package objProg;

public class StaticInnerClass {
	public static void main(String args[]) {
		A2.B objB = new A2.B();
		objB.j = 10;
	}
}

class A2{
	int i;
	static class B{
		int j;
	}
}
