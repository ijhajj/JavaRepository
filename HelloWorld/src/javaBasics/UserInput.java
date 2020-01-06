package javaBasics;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your year of birth :");
		//This checks if the value entered by user next is of type Int
		boolean userEnteredInt = scanner.hasNextInt();
		
		
		
		if(userEnteredInt) {
			int year = scanner.nextInt();
			int age = 2019 - year;
		
			scanner.nextLine();
			System.out.println("Enter your name: ");
			String name = scanner.nextLine();
		
			//takes care of the validity of the year of birth entered by the user
			if (age>=0 && age<=100) {
				System.out.println(name + " you are " + age +" years old!");
			}else {
				System.out.println("Invalid year of birth");
			}
		}else {
			System.out.println("User entered an Invalid birth year value");
		}
		scanner.close();

	}

}
