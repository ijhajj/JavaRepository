package designPatterns;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;

public class Journal {
	private final ArrayList<String> entries = new ArrayList<String>();
	private static int count = 0;
	
	public void addEntry(String text) {
		entries.add(""+ (++count) + ":" + text);
	}
	public void removeEntry(int index) {
		entries.remove(index);
	}
	@Override
	public String toString() {
		return String.join(System.lineSeparator(),entries);
	}	
	//below functionality breaks the SRP (Single Responsibility Principle) as its more of persistence functionality which
	//needs to be added into a separate class
	public void save(String filename) throws FileNotFoundException {
		try (PrintStream out = new PrintStream(filename))
		{
			out.println(toString());
		}
	}
	public void load() {}
	public void load(URL url) {}	
	
}
