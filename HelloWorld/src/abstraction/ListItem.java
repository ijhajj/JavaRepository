package abstraction;

public abstract class ListItem {
	protected ListItem next=null;
	protected ListItem previous=null;
	protected Object value;
	
	public ListItem(Object value) {
		this.value = value;
	}
	
	public abstract ListItem moveToNext();
	public abstract ListItem setNext(ListItem item);
	public abstract ListItem moveToPrevious();
	public abstract ListItem setPrevious(ListItem item);
	
	public abstract int compareTo(ListItem item);
	
	public Object getValue() {
		return this.value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	
}
