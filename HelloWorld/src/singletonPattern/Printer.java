package singletonPattern;

import java.util.HashMap;

public class Printer {
	private static int instanceCount = 0;
	private Printer() {
		instanceCount++;
		System.out.println("A total of " + instanceCount + " instances created");
	}
	private static HashMap<Subsystem,Printer> instances = new HashMap<>();
	public static Printer getInstance(Subsystem syst) {
		if(instances.containsKey(syst)) {
			return instances.get(syst);	//return the one already created
		}
		Printer instance = new Printer();
		instances.put(syst, instance);
		return instance;
	}
}
