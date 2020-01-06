package javaBasics;

import java.util.Scanner;

public class ReadNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int total = 0;
		int counter = 1;
		while(counter<11) {
			System.out.println("Enter number #" + counter +" :");
			
			boolean wasInt = scanner.hasNextInt();
			
			if(wasInt) {
				int number = scanner.nextInt();
				total += number;
				counter +=1;
			}
			else {
				System.out.println("Invalid Number entered, please try again...");
			}
			scanner.nextLine();
		}
		
		System.out.println("The total sum of the numbers entered by user : " +  total);
		scanner.close();

	}

}
