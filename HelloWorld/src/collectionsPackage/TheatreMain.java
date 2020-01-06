package collectionsPackage;

public class TheatreMain {

	public static void main(String[] args) {
		Theatre Plaza = new Theatre("Plaza",1,10);
		//Plaza.getSeats();
		if(Plaza.reserveSeat("A03")) {
			System.out.println("Please Pay");
		}else {
			System.out.println("Sorry, seat is taken");
		}
		//Theatre class with linkedList
		TheatreLList Raheja = new TheatreLList("Raheja",10,10);
		Raheja.reserveSeat("B09");
		
		//TheatreGeneric class with any number of collections
		TheatreGeneric Carnival = new TheatreGeneric("Carnival",26,5);
		Carnival.reserveSeat("B01");
		Carnival.getSeats();
		
		//TheatreComparable class with implementation of Comparable interface
		TheatreComparable PVR = new TheatreComparable("PVR",10,12);
		PVR.reserveSeat("B21");
	}

}
