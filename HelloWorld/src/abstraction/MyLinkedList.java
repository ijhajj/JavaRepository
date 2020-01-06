package abstraction;

public class MyLinkedList implements NodeList{
	private ListItem root=null;
	
	public MyLinkedList(ListItem root) {
		this.root = root;
	}
	@Override
	public ListItem getRoot() {
		return this.root;
	}

	@Override
	public boolean addItem(ListItem newItem) {
		if(this.root==null) {
			this.root = newItem;
			return true;
			
		}
		
		ListItem currentItem = this.root;
		while(currentItem!=null) {
			int comparison = currentItem.compareTo(newItem);
			if (comparison<0) {
				//newItem is greater move right if possible
				if(currentItem.moveToNext()!=null) {
					//traverse to the next item
					currentItem = currentItem.moveToNext();
				}else {
					//there is no next item, so insert at end of list
					//currentItem.setNext(newItem);
					currentItem.setNext(newItem).setPrevious(currentItem);
				}
			}else if(comparison>0) {
				//newItem, is less, insert before
				if(currentItem.moveToPrevious()!=null) {
					//currentItem.moveToPrevious().setNext(newItem);
					//newItem.setPrevious(currentItem.moveToPrevious());
					currentItem.moveToPrevious().setNext(newItem).setPrevious(currentItem.moveToPrevious());
					//newItem.setNext(currentItem);
					//currentItem.setPrevious(currentItem);
					newItem.setNext(currentItem).setPrevious(currentItem);
					return true;
				}else {
					//the node with a previous is the root
					newItem.setNext(this.root);
					this.root.setPrevious(newItem);
					this.root = newItem;
					return true;
				}
			}else {
				//do not add if they are equal
				System.out.println(newItem.getValue() + "is already present, not added.");
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean removeItem(ListItem item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void traverse(ListItem root) {
		// TODO Auto-generated method stub
		
	}

}
