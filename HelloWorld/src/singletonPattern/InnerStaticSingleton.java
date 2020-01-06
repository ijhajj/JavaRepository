package singletonPattern;

public class InnerStaticSingleton {
	
	private InnerStaticSingleton() {}
	private static class InnerStaticClass{
		private static InnerStaticSingleton ISSObj = new InnerStaticSingleton();
	}
	public static InnerStaticSingleton getInstance() {
		return InnerStaticClass.ISSObj;
	}
	
}
