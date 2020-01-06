package javaBasics;

public class Main {

	public static void main(String[] args) {
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("Integer Minimum Value = " + myMinIntValue);
		System.out.println("Integer Maximum Value = " + myMaxIntValue);
		/* Overflow concept */
		System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
		/* Underflow concept */
		System.out.println("Busted Min Value = " + (myMinIntValue - 1));
		
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("My max Byte value = " + myMaxByteValue);
		System.out.println("My min Byte value = " + myMinByteValue);
		
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("My max Short value = " + myMaxShortValue);
		System.out.println("My min Short value = " + myMinShortValue);
		
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("My max Long value = " + myMaxLongValue);
		System.out.println("My min Long value = " + myMinLongValue);
		
		//Byte->Short->Int->Long (BSIL)
		//8 -> 16 -> 32 -> 64
		int myIntInHalf = myMinIntValue/2;
		//Casting
		byte myByteInHalf = (byte)(myMinByteValue/2);
		short myShortInHalf = (short)(myMinShortValue/2);
		System.out.println(myIntInHalf);
		System.out.println(myByteInHalf);
		System.out.println(myShortInHalf);
		//Challenge
		byte newByteNum = 126;
		short newShortNum = 2345;
		int newIntNum = 1234567;
		long newLongNum = 50000L + 10L *(newByteNum+newShortNum+newIntNum);
		System.out.println("Total of the challenge = " + newLongNum);
		short newShortNum1 = (short)(50000 + 10*(newByteNum+newShortNum+newIntNum));
		System.out.println(newShortNum1);
		
		//Float->Double (FD)
		//32 -> 64
		float myMinFloatVal = Float.MIN_VALUE;
		float myMaxFloatVal = Float.MAX_VALUE;
		
		System.out.println("Minimum Float Value = " + myMinFloatVal);
		System.out.println("Maximum Float Value = " + myMaxFloatVal);
		
		double myMinDoubleVal = Double.MIN_VALUE;
		double myMaxDoubleVal = Double.MAX_VALUE;
		System.out.println("Minimum Double Value = " + myMinDoubleVal);
		System.out.println("Maximun Double Value = " + myMaxDoubleVal);
		
		
		int myInt = 5/2;
		float myFloat = 5f/2;
		//another way: float myFloat1 = (float) 5.25;
		double myDouble = 5/2;
		System.out.println("My Int Value :" + myInt);
		System.out.println("My Float Value :" + myFloat);
		System.out.println("My Double Value :" + myDouble);
		
		//Convert pounds to Kilograms
		float poundInput = 30f;
		float inKilograms = poundInput * 0.453592f;
		System.out.println("Print the weight in kilograms :" + inKilograms);
		
		//char and boolean
		//16 bits
		char myChar = 'D';
		char myUnicodeChar = '\u0044';
		System.out.println("My char :" + myChar);
		System.out.println("My UniCode Char :" + myUnicodeChar);
		
		boolean myBoolVal = true;
		System.out.println("My boolean value :" + myBoolVal);
		
		//String
		String myString = "This is my String";
		System.out.println("myString is equal to :" + myString);
		String extendedString = myString + " There is more to it";
		System.out.println("Extended string is :" + extendedString);
		
		//Operands
		boolean isCar = true;
		if (isCar){
			System.out.println("Its a Car");
		}
		else {
			System.out.println("Its a plane");
		}
		boolean result = isCar?true:false;
		System.out.println(result);
		
		
		
		
	}

}
