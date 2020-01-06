package flyweightPattern;
import java.util.HashMap;

public class Memory {
	private HashMap<Character,FontProperty> items = new HashMap<>();
	
	//method to lookup if the object already exists
	public FontProperty lookup(char letter) {
		if(!items.containsKey(letter)) {	//add to the HashMap only if it does not already exist
			items.put(letter, new FontProperty(letter,12,"black"));
		}
		return items.get(letter);
	}
	public int totalObjects() {
		return items.size();
	}
}
