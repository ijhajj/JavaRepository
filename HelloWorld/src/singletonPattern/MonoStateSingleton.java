package singletonPattern;

public class MonoStateSingleton {
	//made the attributes all static
	private static String name;
	private static int age;
	public String getName() {
		return name;
	}
	//instead of "this" accessing attributes by classname
	public void setName(String name) {
		MonoStateSingleton.name = name;
	}
	public int getAge() {
		return age;
	}
	//instead of "this" accessing attributes by classname
	public void setAge(int age) {
		MonoStateSingleton.age = age;
	}
	@Override
	public String toString() {
		return "MonoStateSingleton [name=" + name + ", age=" + age + "]";
	}
	
}
