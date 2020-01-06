package builderPattern;

public class CodeBuilder {
	public String className;
	private final String newLine = System.lineSeparator();
	private CodeElement root = new CodeElement();
	
	public CodeBuilder(String className) {
		this.className = className;	
		//this.toString();	
	}
	public CodeBuilder addField(String name,String type) {
		CodeElement e = new CodeElement(name,type);
		root.elements.add(e);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("public class %s",className));
		sb.append(newLine);
		sb.append("{");
		System.out.println(sb.toString());
		return root.toString();
	}
}
