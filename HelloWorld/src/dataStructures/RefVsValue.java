package dataStructures;

import java.util.Arrays;

public class RefVsValue {
	public static void main(String[] args) {
		//Value Types, only Values are copied
		int myIntValue = 10;
		int anotherIntValue = myIntValue;// MyIntValue ----> 10      and onotherIntValue ------> 10 (different addresses)
		
		System.out.println("MyIntValue = " + myIntValue);
		System.out.println("anotherIntValue = " + anotherIntValue);
		anotherIntValue += 1;
		System.out.println("MyIntValue = " + myIntValue);
		System.out.println("anotherIntValue = " + anotherIntValue);
		
		//Reference Types : BOTH point to same address, thus any change is reflected in both
		int[] myIntArray = {1,2,3,4,5};
		int[] anotherIntArray = myIntArray;
		System.out.println("BEFORE.....");
		System.out.println("myIntArray = " + Arrays.toString(myIntArray));
		System.out.println("anotherIntArray = " + Arrays.toString(anotherIntArray));
		//increment one element
		for(int i=0; i<myIntArray.length;i++) {
			myIntArray[i] +=1;
		}
		System.out.println("AFTER.....");
		System.out.println("myIntArray = " + Arrays.toString(myIntArray));
		System.out.println("anotherIntArray = " + Arrays.toString(anotherIntArray));
		
		System.out.println("After update()");
		update(myIntArray);
		System.out.println("myIntArray = " + Arrays.toString(myIntArray));
		System.out.println("anotherIntArray = " + Arrays.toString(anotherIntArray));
		
	}
	public static void update(int[] array) {
		array[3] = 100;
	}
}
