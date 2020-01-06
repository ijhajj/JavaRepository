package dataStructures;

import java.util.ArrayList;

public class Boxing {

	public static void main(String[] args) {
		String[] strArr = new String[10];
		ArrayList<String> strArrList = new ArrayList<String>();
		strArrList.add("Timmy");
		
		int[] intArr = new int[10];
		ArrayList<Integer> intArrList = new ArrayList<Integer>();
		intArrList.add(20);
		System.out.println(intArrList.get(0));
		
		for(int i=0;i<10;i++) {
			intArrList.add(Integer.valueOf(i));//Auto boxing : converting int to Integer type
		}
		System.out.println(intArrList.toString());
		for(int i=0;i<intArrList.size();i++) {
			System.out.println(intArrList.get(i).intValue());//Auto Un-boxing : Integer -> int
		}
		
		ArrayList<myIntClass> intArrL = new ArrayList<myIntClass>();
		intArrL.add(new myIntClass(39));
		
		//Another short cut way
		Integer myIntegerVal = 50;//internally Java is doing new Integer(50): Auto boxing -> primitive to Class
		int myIntVal = myIntegerVal;//Auto un-boxing : Class to primitive
		
	}

}
class myIntClass{
	private int intVal;
	
	public myIntClass(int value) {
		this.intVal = value;
	}
	
	public int getIntVal() {
		return this.intVal;
	}
	
}
