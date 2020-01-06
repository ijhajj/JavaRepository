package chainOfRespPattern;

public class TestChain {
	public static void main(String[] args) {
		//create objects of all chain objects
		Chain obj1 = new AddNumbers();
		Chain obj2 =  new Subtract();
		Chain obj3 = new Multiply();
		Chain obj4 = new Divide();
		//set the chain of objects
		obj1.setNextChain(obj2);
		obj2.setNextChain(obj3);
		obj3.setNextChain(obj4);
		
		Number request = new Number(10,5,"opo");
		//initiate from the first object
		obj1.calculate(request);
		
	}
}
