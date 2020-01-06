package javaBasics;

public class MinutesToYearsDaysCalculator {

	public static void main(String[] args) {
		printYearsAndDays(561600);

	}
	public static void printYearsAndDays(long minutes) {
		if (minutes<0) {
			System.out.println("Invalid Value");
		}else {
			int hours=0, days = 0, years = 0;
			hours = (int)minutes/60;
			
			if (hours>=24) {
				days = (int)(hours/24);
				
				if (days>=365) {
					years = (int)days/365;
					days = days - (years*365);
				}
				
			}
			
			System.out.println(minutes + " min = " + years + " y and " + days + " d");
		}
		
	}

}
