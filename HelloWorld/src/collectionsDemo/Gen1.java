package collectionsDemo;

import java.util.ArrayList;

class Container<T extends Number>{
	T value;
	//Returns the type of the variable becomes
	public void show() {
		System.out.println(this.value.getClass().getName());
	}
	//Suppose the method needs an arraylist of Integers only
	public void demo(ArrayList<Integer> obj) {
		
	}
	//I wish it to support "Number" type objects too
	public void demoNumber(ArrayList<? extends Number> obj) {
		
	}
	//Another generic way would be 
	public void demoGenNumber(ArrayList<? extends T> obj) {
		
	}
	//Another way to support parent classes
	public void demoSuper(ArrayList<? super T> obj) {
		
	}
}

public class Gen1 {
	public static void main(String[] args) {
		Container<Integer> Obj = new Container<>();
		Obj.value = 100;
		Obj.show();			//<-- java.lang.Integer -->
		
		Container<Double> dObj = new Container<>();
		dObj.value = 10d;
		dObj.show();		//<-- java.lang.Double -->
		
		//Container<String> sObj = new Container<>();  	<-- Compiler starts complaining -->
		//Obj.demo(new ArrayList<Number>()); <-- Compiler complains -->
		Obj.demoNumber(new ArrayList<Number>());
		
		Container<Number> objNum = new Container<>();
		objNum.demoGenNumber(new ArrayList<Number>());
		objNum.demoGenNumber(new ArrayList<Integer>());
		
		Obj.demoSuper(new ArrayList<Integer>());
		Obj.demoSuper(new ArrayList<Number>());
	}

}
