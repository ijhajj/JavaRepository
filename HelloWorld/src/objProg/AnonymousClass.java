package objProg;

public class AnonymousClass {
	public static void main(String[] args) {
	A objA = new A() {
		void show() {
			System.out.println("Anonymous Inner Class");
		}
	};
	C objc = new C() {
		public void print() {
			System.out.println("Printing");
		}
	};

}
}

interface C{
	void print();
}

class A{
	void show() {
		System.out.println("Showing A");
	}
}
class B extends A{
	void show() {
		System.out.println("Showing A & B");
	}
}
