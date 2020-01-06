package dataStructures;
import java.util.ArrayList;

public class BoxGear {
	private ArrayList<Gear> gears;
	private ArrayList<PrivateGear> pGears;
	private int maxGears;
	private int currentGear = 0;
	
	public BoxGear(int maxGears) {
		this.gears = new ArrayList<Gear>();
		this.maxGears = maxGears;
		Gear neutral = new Gear(0,0.0);
		this.gears.add(neutral);
		//this.currentGear = currentGear;
	}
	//method to access the private nested class
	public void addPrivateGear(int number,double pratio) {
		this.pGears = new ArrayList<PrivateGear>();
		PrivateGear pGear = new PrivateGear(number,pratio);
		this.pGears.add(pGear);
	}
	
	public double pSpeed(int pRevs) {
		return pRevs * (this.pGears.get(currentGear).pRatio);
	}
	
	public class Gear{
		private int gearNumber;
		private double ratio;
		
		public Gear(int gearNumber,double ratio) {
			this.gearNumber = gearNumber;
			this.ratio = ratio;
		}
		
		public double driveSpeed(int revs) {
			return (revs*(this.ratio));
		}
	}
	
	private class PrivateGear{
		private int pGearNumber;
		private double pRatio;
		
		public PrivateGear(int pGearNumber,double pRatio) {
			this.pGearNumber = pGearNumber;
			this.pRatio = pRatio;
		}
		
		public double pDriveSpeed(int pRevs) {
			return pRevs*(this.pRatio);
		}
		
		public double getpRation() {
			return this.pRatio;
		}
	}
	
}
