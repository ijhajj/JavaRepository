package objProg;

public class CountInstanceStatic {
	private static int instanceCount = 0;
	public final int eachInstanceCount;
	private final String name;
	
	public CountInstanceStatic(String name) {
		this.name = name;
		instanceCount ++;//incrementing as its static and not final
		eachInstanceCount = instanceCount;
		System.out.println(name + " instance created, with instance number : " + eachInstanceCount);
	}
	
	public int getEachInstanceCount() {
		return eachInstanceCount;
	}

}
