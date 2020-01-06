package dataStructures;

public class NestedMainClass {

	public static void main(String[] args) {
		//BoxGear class has nested class Gear
		BoxGear mcLaren = new BoxGear(6);
		//Nested inner class will need the object of the outer static class to create the object of the nested class
		//note the usage of "<instance of outerclass>.new" syntax
		BoxGear.Gear firstGear = mcLaren.new Gear(1, 12.3);
		System.out.println(firstGear.driveSpeed(1000));
		//if the nested inner class is declared private, then above syntax will not work
		BoxGear mcL2 = new BoxGear(7);
		mcL2.addPrivateGear(1, 5.3);
		
		System.out.println(mcL2.pSpeed(1000));
		

	}

}
