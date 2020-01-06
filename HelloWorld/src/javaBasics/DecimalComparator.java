package javaBasics;

public class DecimalComparator {

	public static void main(String[] args) {
		System.out.println(areEqualByThreeDecimalPlaces(-3.00,-2.0));

	}
	public static boolean areEqualByThreeDecimalPlaces(double num1,double num2) {
		Double d1 = num1;
		String[] numArr1 = d1.toString().split("\\.");
		d1 = num2;
		String[] numArr2 = d1.toString().split("\\.");
		
		if ((numArr1[1].length()>=3) && (numArr2[1].length()>=3)) {
			String number1 = numArr1[1].substring(0, 3);
			String number2 = numArr2[1].substring(0, 3);
			if(number1.equals(number2)) {
				return true;
			}
		}
		else {
			String number1 = numArr1[1].substring(0);
			String number2 = numArr2[1].substring(0);
			if (number1.equals(number2)) {
				return true;
			}
		}
		return false;		
	}
}
