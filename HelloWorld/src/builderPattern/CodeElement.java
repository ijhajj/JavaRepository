package builderPattern;

import java.util.ArrayList;

public class CodeElement {
	public String name,type;
	private final String newLine = System.lineSeparator();
	public ArrayList<CodeElement> elements = new ArrayList<>();
	private final int indent = 2;
	
	public CodeElement() {
		
	}
	
	public CodeElement(String name,String type) {
		this.name = name;
		this.type = type;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();	
		for (CodeElement e:elements) {
			sb.append(String.format("%s %s;",e.name,e.type));
			sb.append(newLine);
		}
		sb.append("}");
		return sb.toString();
	}

}
