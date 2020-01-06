package objProg;

public class MainStatic {
	public static int multiplier = 7;
	
	public static void main(String[] args) {
		StaticTest firstInstance = new StaticTest("1st Instance");
		System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getNumInstance());
		StaticTest secondInstance = new StaticTest("2nd Instance");
		System.out.println(secondInstance.getName() + " is instance number " + secondInstance.getNumInstance());
		
		
		System.out.println(secondInstance.getName() + " is instance number " + secondInstance.getNumberOfInstances());
		StaticTest thirdInstance = new StaticTest("3rd Instance");
		System.out.println(thirdInstance.getName() + " is instance number " + secondInstance.getNumberOfInstances());
		
		System.out.println("Total instances created so far " + StaticTest.getNumIns());
		
		//Main is static method - does not need an instance of the class to be created for invoking it
		//Static methods cannot access non-static members or fields because at this point non-static are not instantiated
		//Thus, we need to make the multiplier variable and multiply method to be static
		//This restriction is limited only for accessing within the same class
		//We can still access the non static fields inside the static methods from a different class, cause the class gets instantiated in this scenario
		
		//Static methods can be called from inside non static methods
		
		System.out.println("Multiplier is : " + multiplier);
		System.out.println("Answer is : " + multiply(10));
		
		//CountInstanceStatic class
		CountInstanceStatic one = new CountInstanceStatic("First");
		CountInstanceStatic second = new CountInstanceStatic("Second");
		CountInstanceStatic third = new CountInstanceStatic("Third");
		
		System.out.println(one.getEachInstanceCount());
		System.out.println(second.getEachInstanceCount());
		System.out.println(third.getEachInstanceCount());
		//Password class
		Password pwd1 = new Password(123456);
		pwd1.storePassword();
		pwd1.letMeIn(-1);
		pwd1.letMeIn(123456);
		//ExtendedPassword Class
		System.out.println("Totally messed by the super class functionality in its subclass");
		ExtendedPassword exPwd = new ExtendedPassword(123456);
		exPwd.storePassword();
		exPwd.letMeIn(-1);
		exPwd.letMeIn(123456);
		//Thus making the storePassword final in the parent class will stop users from messing up the functionalities in the subclasses
		//StaticIntitializationBlock class
		
		System.out.println("*********");
		StaticIntitializationBlock sib1 = new StaticIntitializationBlock();
		sib1.someMethod();
	}
	static public int multiply(int number) {
		return number * multiplier;
	}

}
