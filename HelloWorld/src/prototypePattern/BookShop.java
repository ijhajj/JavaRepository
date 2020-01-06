package prototypePattern;
import java.util.ArrayList;

public class BookShop implements Cloneable{
	private String shopName;
	private ArrayList<Book> books = new ArrayList<>();
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public ArrayList<Book> getBooks() {
		return books;
	}
	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", books=" + books + "]";
	}
	
	public void loadBooks() {
		for(int i=0;i<10;i++) {
			Book b = new Book();
			b.setBookID(i);
			b.setBookName("Book" + i);
			books.add(b);//Add to the ArrayList
		}
	}
	//Change below method so as to support deep cloning
	//@Override
	//protected Object clone() throws CloneNotSupportedException {
	//	return super.clone();
	//}
	
	//This is deep copy : each element is added into the new bookshop
	@Override 
	protected BookShop clone() throws CloneNotSupportedException{
		BookShop bs = new BookShop();
		for (Book books:this.getBooks()) {
			bs.books.add(books);
		}
		return bs;
		
	}
	
}
