package abstraction;

public class Node extends ListItem{
	
	public Node(Object value) {
		super(value);
	}

	@Override
	public ListItem moveToNext() {
		return this.next;
	}

	@Override
	public ListItem setNext(ListItem item) {
		this.next = item;
		return this.next;
	}

	@Override
	public ListItem moveToPrevious() {
		return this.previous;
	}

	@Override
	public ListItem setPrevious(ListItem item) {
		this.previous = item;
		return this.previous;
	}

	@Override
	public int compareTo(ListItem item) {
		if(item!=null) {
			return ((String) super.getValue()).compareTo((String) item.getValue());
		}else {
		return -1;
		}
	}
	
	
}
