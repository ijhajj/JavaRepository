package builderPattern;

public class HTMLBuilder {
	private String rootName;
	private HTMLElement root = new HTMLElement();
	
	public HTMLBuilder(String rootName) {
		this.rootName = rootName;
		root.name = rootName;
	}
	
	public HTMLBuilder addChild(String childName,String childText) {
		HTMLElement e = new HTMLElement(childName,childText);
		root.elements.add(e);
		return this;
	}
	
	public void clear() {
		root = new HTMLElement();
		root.name = rootName;
	}
	
	@Override
	public String toString() {
		return root.toString();
	}
}
