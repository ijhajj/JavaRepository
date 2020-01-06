package singletonPattern;

public class MonoStateMain {

	public static void main(String[] args) {
		MonoStateSingleton Obj1 = new MonoStateSingleton();
		Obj1.setName("Henry");
		Obj1.setAge(20);
		System.out.println(Obj1);
		MonoStateSingleton Obj2 = new MonoStateSingleton();
		//already having values because it did not create a new reference, 
		//just the new obj pointing to old reference
		System.out.println(Obj2);

	}

}
