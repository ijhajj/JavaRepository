package objProg;

public class MainHouseClass {

	public static void main(String[] args) {
		RoomDimensions RDimensions= new RoomDimensions(20,30,10);
		Bed bed= new Bed(3,4,2);
		Table table = new Table(1,1,2);
		Chair chair = new Chair(1,2,2);
		Furniture furniture = new Furniture(bed,table,chair);
		Room bedRoom = new Room(RDimensions,furniture);
		
		bedRoom.getData();
		
		//Player
		Player player = new Player(); player.name = "Tim"; player.health = 20;
		player.weapon="Sword";
		
		int damage = 10; player.loseHealth(damage);
		System.out.println("Remaining health = " + player.healthRemaining());
		
		damage = 11; player.loseHealth(damage);
		System.out.println("Remaining health = " + player.healthRemaining());
	
		//Encapsulation - EnhancedPlayer Class
		EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tim", 50, "Sword");
		System.out.println("Initial health of Player " + enhancedPlayer.getName() + " is " + enhancedPlayer.getHealth());
		
		//Printer Class
		Printer printer = new Printer(88.0, 100, false);
		printer.getCapacity();
		printer.printing();
	}

}
