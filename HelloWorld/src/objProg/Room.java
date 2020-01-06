package objProg;

public class Room {
	private RoomDimensions RDimensions;
	private Furniture furniture;
	public Room(RoomDimensions rDimensions, Furniture furniture) {
		super();
		RDimensions = rDimensions;
		this.furniture = furniture;
	}
	
	public void getData() {
		RDimensions.space();
		furniture.getFurnitureDetails();
	}
	
}
