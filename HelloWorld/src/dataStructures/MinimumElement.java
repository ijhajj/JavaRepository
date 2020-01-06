package dataStructures;
import java.util.Scanner;

public class MinimumElement {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number of integers user need to enter");
		int count = scanner.nextInt();
		int[] array = readIntegers(count);
		System.out.println("Minum Value in the array : " + findMin(array));
	}
	public static int[] readIntegers(int count) {
		int[] array = new int[count];
		for(int i=0;i<count;i++) {
			System.out.println("Enter the " + i + "th number :");
			int number = scanner.nextInt();
			array[i] = number;
		}
		return array;
	}
	public static int findMin(int[] array) {
		int minVal=0;
		int temp=array[0];
		for (int i=1; i<array.length;i++) {
			if(temp<=array[i]) {
				minVal = temp;
			}else {
				minVal = array[i];
			}
		}
		return minVal;
	}
}
