package javaBasics;

public class NumberPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));

	}
	public static boolean isPalindrome(int number) {
		if(number<0) {
			number *= -1;
		}
		int reverseNumber = 0;
		int origNum = number;
		int factor = 1;
		while(number>0) {							
			int number1 = number%10; 	
			number = (int) number/10;	
			reverseNumber = reverseNumber*factor + number1; 
			factor = 10;	
		}
		if (origNum == reverseNumber) {
			return true;
		}
		return false;
	}
}
