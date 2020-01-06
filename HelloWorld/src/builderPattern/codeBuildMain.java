package builderPattern;

public class codeBuildMain {

	public static void main(String[] args) {
		CodeBuilder cd = new CodeBuilder("Person").addField("name", "String").addField("age", "int");
		System.out.println(cd);
		String classpath = System.getProperty("java.class.path");
		System.out.println(classpath);
	}

}
