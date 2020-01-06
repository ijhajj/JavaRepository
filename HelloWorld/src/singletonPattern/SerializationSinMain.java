package singletonPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationSinMain {

	public static void main(String[] args) throws Exception{
		SerializationSingleton SSObj = SerializationSingleton.getInstance();
		SSObj.setValue(111);
	
		//Use serialization to overwrite this Singleton behavior
		String filename = "SingletonFile.txt";
		saveToFile(SSObj,filename);
		SSObj.setValue(222);
		SerializationSingleton SSObj2 = readFromFile(filename);
		System.out.println(SSObj == SSObj2);	//shows the two objects are different
		System.out.println(SSObj.getValue());	// gets overwritten with most recent value
		System.out.println(SSObj2.getValue());	//still reading from file
		//thus,both now are independent objects
	}
	static void saveToFile(SerializationSingleton SSObj,String filename) throws Exception{
		try {
			FileOutputStream fileOut = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(SSObj);
		}catch(Exception e){
			System.out.println("Error encountered while trying to write into a file");
		}
	}
	static SerializationSingleton readFromFile(String filename) throws Exception{
		SerializationSingleton readObj = null;
		try {
			FileInputStream fileIn = new FileInputStream(filename);
			ObjectInputStream inObj = new ObjectInputStream(fileIn);
			readObj = (SerializationSingleton)inObj.readObject();
		}catch(Exception e) {
			System.out.println("Error encountered while trying to read from the file");
		}
		return readObj;
	}

}
