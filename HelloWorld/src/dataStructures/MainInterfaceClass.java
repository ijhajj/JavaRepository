package dataStructures;
import java.util.ArrayList;
import java.util.Scanner;

public class MainInterfaceClass {

	public static void main(String[] args) {
		PlayerGame IP = new PlayerGame("IP",10,15);
		System.out.println(IP.toString());
		saveObject(IP);
		IP.setHitPoints(8);
		System.out.println(IP);
		IP.setWeapon("StormBringer");
		saveObject(IP);
		//loadObj(IP);
		System.out.println(IP);
		
		//PlayerMonster Class
		PlayerMonster mon = new PlayerMonster("WearWolf",10,20);
		System.out.println(mon);
		saveObject(mon);
		System.out.println(mon.getStrength());
		
		//Using Interface to create the object
		Saveable mon2 = new PlayerMonster("Vampire",11,50);
		System.out.println(((PlayerMonster)mon2).getStrength());//need to exclusively typecast so as to pick the other methods as well
		
		//Its upto how we use the object, we can decide to create instance of Interface or the class that implements the interface
		// if we need to point different objects on the run, use Interface instance
		// if we need to use the methods other than the original interface, we need to create the instance of the class that implements the interface
	}
	public static ArrayList<String> readValues(){
		ArrayList<String> values = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		int index = 0;
		System.out.println("Choose \n" +
						"1 - to enter a String\n" +
						"0 - Quit ");
		
		while(!quit) {
			System.out.println("Enter your choice");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 0:
				quit = true;
				break;
			case 1:
				System.out.println("Enter a String");
				String stringInput = scanner.nextLine();
				values.add(index,stringInput);
				index++;
				break;
			default:
				break;
			}
		}
		return values;
}
	public static void saveObject(Saveable saveObj) {
		for(int i=0;i<saveObj.write().size();i++) {
			System.out.println("Saving " + saveObj.write().get(i) + " to storage device");
		}
	}
	public static void loadObj(Saveable savedObj) {
		ArrayList<String> values = readValues();
		savedObj.read(values);
	}
}
