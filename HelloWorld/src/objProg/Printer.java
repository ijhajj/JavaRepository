package objProg;

public class Printer {
	private double tonerLevel;
	private int pages;
	private boolean duplex;
	
	public Printer(double tonerLevel,int pages,boolean duplex) {
		this.tonerLevel = tonerLevel;
		this.pages = pages;
		this.duplex = duplex;
	}
	
	public void fillToner(double addToner) {
		this.tonerLevel += addToner;
		if (this.getTonerLevel()>100.0) {
			this.tonerLevel = 100.0;
		}
	}
	
	private double getTonerLevel() {
		return this.tonerLevel;
	}
	
	public void printing() {
		for(int i = 1; i<=this.pages;i++) {
			System.out.println("Printing page " + i);
		}
	}
	
	public int getCapacity() {
		if (this.duplex) {
			System.out.println("Duplex printer, can print " + (this.pages)*2 + " pages");
			return (this.pages*2);
		}
		else {
			System.out.println("Not a Duplex printer, can print " + (this.pages) + " pages");
			return (this.pages);
		}
	}

}
