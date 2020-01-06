package dataStructures;

public class AnonymousInnerClass {

	public static void main(String[] args) {
		//no separate class to implement the interface
		//
		Age myAge = new Age() {
			@Override
			public void getAge() {
				System.out.println("Age is " + age);
			}
		};
		myAge.getAge();

	}

}
