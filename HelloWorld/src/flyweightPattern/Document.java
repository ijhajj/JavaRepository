package flyweightPattern;

import java.util.ArrayList;
import java.util.List;

public class Document {
	private Memory memory = new Memory();	//create a memory space - HashMap
	private List<FontProperty> letters = new ArrayList<>();
	
	public void typeLetter(char letter) {
		FontProperty fontProp = memory.lookup(letter); //check if the typed letter is already present, if not add it
		letters.add(fontProp); //add its font property in the list
	}
	public void process() {
		for (FontProperty item:letters) {
			item.display();
		}
	}
	public void report() {
		System.out.println("Total Items : " +  memory.totalObjects());
	}

}
