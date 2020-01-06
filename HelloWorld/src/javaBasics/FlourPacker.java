package javaBasics;

public class FlourPacker {

	public static void main(String[] args) {
		System.out.println(canPack(2,1,5));

	}
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		if (bigCount<0 || smallCount<0) {
			return false;
		}
		int bigTotal = bigCount*5;
		int smallTotal = smallCount*1;
		int total = bigTotal + smallTotal;
		
		if (total==goal){
			return true;
		}
		
		if (bigTotal>goal) {
			return false;
		}
		if (smallTotal>goal) {
			return true;
		}
		return false;
		
	}
}
