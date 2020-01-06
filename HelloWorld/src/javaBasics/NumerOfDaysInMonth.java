package javaBasics;

public class NumerOfDaysInMonth {

	public static void main(String[] args) {
		//System.out.println(isLeapYear(-2000));
		System.out.println(getDaysInMonth(-1,2018));

	}
	public static boolean isLeapYear(int year) {
		if (year>=1 && year<=9999) {
			if (year%4 == 0) {
				if (year%100 == 0) {
					if(year%400 == 0) {
						return true;
					}
				}else {
				return true;
				}
			}
		}
		return false;
	}
	
	public static int getDaysInMonth(int month,int year) {
		if ((month<1 || month>12)||(year<1 || year>9999)){
			return -1;
		}
		boolean checkLeapYear = isLeapYear(year);
		//System.out.println(checkLeapYear);
		int days = 0;
		switch(month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			days = 31;
			break;
		case 4:case 6:case 9:case 11:
			days = 30;
			break;
		case(2):
			if (checkLeapYear) {
				days = 29;
			}else {
				days = 28;
			}
			break;
		default:
			days = -1;
			break;
		}
		return days;
	}

}
