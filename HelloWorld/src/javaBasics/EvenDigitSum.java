package javaBasics;

public class EvenDigitSum {

	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(-22));

	}
	public static int getEvenDigitSum(int number){//12345
		if (number<0) {
			return -1;
		}
		int sum = 0;
		while(number>0) {
			int remainder = number%10; //12345 --> 5
			if (remainder%2==0) {
				sum +=remainder;
			}
			number = number/10; //1234
		}
		return sum;
	}
}
