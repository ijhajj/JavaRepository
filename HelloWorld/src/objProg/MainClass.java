package objProg;

public class MainClass {

	public static void main(String[] args) {
		Animal animal = new Animal("Animal",1,1,5,5);
		Dog dog = new Dog("Yorkie",8,20,2,4,1,20,"long silky");
		dog.eat();
		
		//Rectangle & Cuboid Class
		Rectangle rectangle = new Rectangle(5,10);
		System.out.println("rectangle.width = "+rectangle.getWidth());
		System.out.println("rectangle.length = "+rectangle.getLength());
		System.out.println("rectangle.area = "+rectangle.getArea());
		Cuboid cuboid = new Cuboid(5,10,5);
		System.out.println("cuboid.width = "+cuboid.getWidth());
		System.out.println("cuboid.length = "+cuboid.getLength());
		System.out.println("cuboid.volume = "+ cuboid.getVolume());
		
		//PC, Motherboard, Case, Monitor, Dimensions, Resolution class
		System.out.println("*********************************************************");
		System.out.println("*PC/Motherboard/Case/Monitor/Dimensions/Resolution Class*");
		System.out.println("*********************************************************");
		Dimensions dimensions = new Dimensions(20,20,5);
		Case theCase = new Case("2208","Dell","240",dimensions);
		
		Resolution nativeResolution = new Resolution(2540,1440);
		Monitor monitor = new Monitor("27inch","Acer",27,nativeResolution);
		
		Motherboard motherboard = new Motherboard("BJ-200","Asus",4,6,"v2.44");
		
		PC thePC = new PC(theCase,monitor,motherboard);
		thePC.powerUp();
		
	}

}
