package dataStructures;
import java.util.Arrays;
import java.util.Scanner;

public class ChangeArraySize {
	private static Scanner scanner = new Scanner(System.in);
	private static int[] baseArray = new int[10];
	public static void main(String[] args) {
		readIntegers();
		System.out.println(Arrays.toString(baseArray));
		resizeArray();
		System.out.println(Arrays.toString(baseArray));

	}
	public static void readIntegers() {
		for(int i=0;i<baseArray.length;i++) {
			System.out.println("Enter the " + i + "th number :");
			int number = scanner.nextInt();
			baseArray[i] = number;
		}
	}

	public static void resizeArray() {
		int[] tempArray = baseArray;
		baseArray = new int[12];
		for(int i=0;i<tempArray.length;i++) {
			baseArray[i]= tempArray[i];
		}		
	}
}
