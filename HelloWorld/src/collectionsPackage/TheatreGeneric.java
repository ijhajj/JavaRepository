package collectionsPackage;

import java.util.LinkedList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;


public class TheatreGeneric {
		private final String theatreName;
		//private Collection<Seat> seatsList = new HashSet<>();//in any order
		private Collection<Seat> seatsList = new LinkedHashSet<>();//will be sorted
		
		public TheatreGeneric(String theatreName,int numRows,int seatsPerRow) {
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
			Seat requestedSeat=null;
			for(Seat seat:seatsList) {
				if(seat.getSeatNumber().equals(seatNumber)) {
					requestedSeat = seat;
					break;
				}
			}
			if(requestedSeat==null) {
				System.out.println("There is no seat with " + seatNumber + "number in the theatre");
				return false;
			}
			return requestedSeat.reserve();
		}
		//for testing
		public void getSeats() {
			for(Seat seat:seatsList) {
				System.out.println(seat.getSeatNumber());
			}
		}
		//Seat Class
		private class Seat {
			private String seatNum;
			private boolean reserved=false;
			
			public Seat(String seatNum) {
				this.seatNum = seatNum;
			}
			public String getSeatNumber() {
				return this.seatNum;
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
