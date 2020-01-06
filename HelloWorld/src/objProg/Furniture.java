package objProg;

public class Furniture {
	private Bed bed;
	private Table table;
	private Chair chair;
	
	public Furniture(Bed bed, Table table, Chair chair) {
		super();
		this.bed = bed;
		this.table = table;
		this.chair = chair;
	}
	
	public void getFurnitureDetails() {
		bed.bSize();
		table.tSize();
		chair.cSize();
	}
	
}
