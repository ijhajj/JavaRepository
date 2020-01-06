package dataStructures;

import java.util.Scanner;

public class MainArray {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int[] array1;
		array1 = new int[10];
		//int[] array1 = new int[10];
		array1[5] = 50;
		for (int i=0;i<10;i++) {
			System.out.println(array1[i]);
		}
		
		int[] myIntegers = getIntegers(5);
		int sum = 0;
		for (int i=0;i<myIntegers.length;i++) {
			System.out.println("User entered myIntegers[" + i + "] = " + myIntegers[i]);
			sum +=myIntegers[i];
		}
		System.out.println("Average of all values in myIntegers array : " + (sum/5));
		
	}
	public static int[] getIntegers(int number) {
		System.out.println("Enter " +  number + "integer values.\r");
		int[] values = new int[number];
		for (int i =0; i<values.length; i++) {
			values[i] = scanner.nextInt();
		}
		return values;
	}

}
