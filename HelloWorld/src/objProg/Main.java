package objProg;

public class Main {

	public static void main(String[] args) {
		Car porche = new Car();
		Car holden = new Car();
		
		porche.setModel("arrera");
		System.out.println("Model is " + porche.getModel());
		
		//Class SimpleCalculator
		SimpleCalculator calculator = new SimpleCalculator();
		calculator.setFirstNumber(5.0);
		calculator.setSecondNumber(0);
		System.out.println("add = "+calculator.getAdditionResult());
		System.out.println("subtract = "+calculator.getSubtractionResult());
		System.out.println("multiplication = "+calculator.getMultiplicationResult());
		System.out.println("Division = " + calculator.getDivisionResult());
		
		//Class Person
		Person person = new Person();
		person.setFirstName("");
		person.setLastName("");
		person.setAge(10);
		System.out.println("fullName = " + person.getFullName());
		System.out.println("teen = " + person.isTeen());
		
		person.setFirstName("John");
		person.setLastName("");
		person.setAge(14);
		System.out.println("fullName = " + person.getFullName());
		System.out.println("teen = " + person.isTeen());
		
		person.setFirstName("John");
		person.setLastName("Smith");
		person.setAge(21);
		System.out.println("fullName = " + person.getFullName());
		System.out.println("teen = " + person.isTeen());
		
		//Account Class
		Account account = new Account();
		System.out.println(account.getCustomerName());
		account.depositFunds(100.0);
		account.depositFunds(100.0);
		account.depositFunds(100.0);
		account.depositFunds(100.0);
		account.withdrawFunds(50.0);
		Account acc1 = new Account(12345,450.0,"Henry","xze@gmlai.com",012443120);
		
		//Wall Class
		Wall w1 = new Wall(5,4);
		System.out.println("area = " + w1.getArea());
		
		w1.setHeight(-1.5);
		System.out.println("Width = " + w1.getWidth());
		System.out.println("Height = " + w1.getHeight());
		System.out.println("Area = " + w1.getArea());
		
		//Point Class
		Point p1 = new Point(6,5);
		Point p2 = new Point(3,1);
		
		System.out.println("distance from (0,0) : " + p1.distance());
		System.out.println("distance from p2 : " + p1.distance(p2));
		System.out.println("distance from (2,2) : " + p1.distance(2,2));
		Point p =  new Point();
		System.out.println(" distance() = " + p.distance());
		
		//Floor, Carpet, Calculator class
		Carpet carpet = new Carpet(3.5);
		Floor floor = new Floor(2.75,4.0);
		Calculator calculator1 = new Calculator(floor,carpet);
		System.out.println("total = " + calculator1.getTotalCost());
		Carpet carpet1 = new Carpet(1.5);
		Floor floor1 = new Floor(5.4,4.5);
		Calculator calculator2 = new Calculator(floor1,carpet1);
		System.out.println("total = " + calculator2.getTotalCost());
		
		//ComplexNumber Class
		ComplexNumber one = new ComplexNumber(1.0,1.0);
		ComplexNumber number = new ComplexNumber(2.5,-1.5);
		one.add(1,1);
		System.out.println("one.real = " + one.getReal());
		System.out.println("one.imaginary = "+ one.getImaginary());
		
		one.subtract(number);
		System.out.println("one.real = " + one.getReal());
		System.out.println("one.imaginary = "+ one.getImaginary());
		
		number.subtract(one);
		System.out.println("one.real = " + number.getReal());
		System.out.println("one.imaginary = "+ number.getImaginary());
		
		//Circle , Cylinder Class
		Circle circle = new Circle(3.75);
		System.out.println("circle.radius = " + circle.getRadius());
		System.out.println("circle.area = " + circle.getArea());
		Cylinder cylinder = new Cylinder(5.55,7.25);
		System.out.println("cylinder.radius = " + cylinder.getRadius());
		System.out.println("cylinder.height = " + cylinder.getHeight());
		System.out.println("cylinder.area = " + cylinder.getArea());
		System.out.println("cylinder.volume = " + cylinder.getVolume());
		
		
	}

}
