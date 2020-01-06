package designPatterns;
import java.io.File;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.net.URL;

//This class caters to the way Journal data can be saved/loaded from the disk
public class JournalPersistence {
	public void saveToFile(Journal J, String filename, boolean overWrite) throws FileNotFoundException {
		if(overWrite || new File(filename).exists()) {
			try(PrintStream pStream = new PrintStream(filename)){
				pStream.println(J.toString());
			}
		}
	}
	public void load(String filename) {}
	public void URL(URL url) {}
	
}
