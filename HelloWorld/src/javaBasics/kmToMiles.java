package javaBasics;

public class kmToMiles {
	public static void main(String[] args) {
		double kilometersPerHour = 95.75;
		System.out.println(toMilesPerHour(kilometersPerHour));
		printConversion(kilometersPerHour);
	}

	public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour<0){
            return -1;
        }else{
        	return (long)(Math.round((kilometersPerHour /1.609)));
        }
    }
	public static void printConversion(double kilometersPerHour) {
		if (kilometersPerHour<0) {
			System.out.println("Invalid Value");
		}else {
		long result = toMilesPerHour(kilometersPerHour);
		System.out.println(kilometersPerHour + " km/h = " + result + " mi/h");
		}
	}

}
