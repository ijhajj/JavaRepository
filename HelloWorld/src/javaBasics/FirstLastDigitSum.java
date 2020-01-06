package javaBasics;

public class FirstLastDigitSum {

	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(10));

	}
	public static int sumFirstAndLastDigit(int number) {
		if (number<0) {
			return -1;
		}
		int first = number%10;
		while(number>=10) {
			number = (int)number/10; 	
		}
		int last = number;
		int sum = first + last;
		return sum;
	}

}
