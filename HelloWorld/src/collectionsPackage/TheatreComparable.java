package collectionsPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class TheatreComparable {
	private final String theatreName;
	private List<Seat> seatsList = new ArrayList<>();
	
	public TheatreComparable(String theatreName,int numRows,int seatsPerRow) {
		this.theatreName = theatreName;
		
		int lastRow = 'A' + (numRows-1);
		//Allocate seats
		for (char row='A';row<=lastRow;row++) {
			for(int seatNum=1;seatNum<seatsPerRow;seatNum++) {
				Seat seat = new Seat(row + String.format("%02d",seatNum));
				seatsList.add(seat);
				//System.out.println("Seat " + seat.seatNum);
			}
		}
	}
	
	public String gettheatreName() {
		return this.theatreName;
	}
	
	public boolean reserveSeat(String seatNumber) {
		//Seat requestedSeat=null;
		//Since Comparable interface is implemented by Seat class
		//Can use BinarySearch method to look if the seat is present
		Seat requestedSeat = new Seat(seatNumber);
		int seatFoundIndx = Collections.binarySearch(seatsList, requestedSeat,null);
		if (seatFoundIndx >=0) {
			return seatsList.get(seatFoundIndx).reserve();
		}else {
			System.out.println("There is no Seat " + seatNumber);
			return false;
		}
	}
	//for testing
	public void getSeats() {
		for(Seat seat:seatsList) {
			System.out.println(seat.getSeatNumber());
		}
	}
	//Seat Class will implement comparable & override compareTo method
	private class Seat implements Comparable<Seat>{
		private String seatNum;
		private boolean reserved=false;
		
		public Seat(String seatNum) {
			this.seatNum = seatNum;
		}
		public String getSeatNumber() {
			return this.seatNum;
		}
		@Override
		public int compareTo(Seat seat) {
			return this.seatNum.compareToIgnoreCase(seat.seatNum);
		}
		
		public boolean reserve() {
			if(!this.reserved) {
				this.reserved = true;
				System.out.println("Seat " + this.seatNum + " reserved");
				return true;
			}
			System.out.println("Seat " + seatNum + " is already reserved");
			return false;
		}
		public boolean cancelSeat() {
			if(this.reserved) {
				this.reserved = false;
				System.out.println("Reservation of seat " + seatNum + " cancelled");
				return true;
			}
			System.out.println("Seat " + seatNum + " is not reserved, so could not cancel it");
			return false;
		}
	}
}
