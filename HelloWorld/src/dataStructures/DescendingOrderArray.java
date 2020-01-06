package dataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingOrderArray {

	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int[] myIntArray = getIntegers(5);
		printArray(myIntArray);
		int[] sortedArray = sortArray(myIntArray);
		printArray(sortedArray);
		
	}
	public static int[] getIntegers(int number) {
		System.out.println("Enter " + number + " numbers to be sorted in descending order");
		int[] array1 = new int[number];
		for (int i=0;i<array1.length;i++) {
			array1[i] = scanner.nextInt();
		}
		return array1;
	}
	public static void printArray(int[] myArray) {
		System.out.println("Array has values: ");
		for (int i=0;i<myArray.length;i++) {
			System.out.println("myArray["+i+"] = " + myArray[i]);
		}
	}
	public static int[] sortArray(int[] myArray) {

		int[] sortedArray = Arrays.copyOf(myArray, myArray.length);

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i=0; i<sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
	}
}
