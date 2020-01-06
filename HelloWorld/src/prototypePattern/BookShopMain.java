package prototypePattern;

public class BookShopMain {
	public static void main(String args[]) throws CloneNotSupportedException {
		BookShop IPBooks = new BookShop();
		IPBooks.setShopName("IP Book Shop");
		IPBooks.loadBooks();
		//IPBooks.getBooks().remove(2);
		System.out.println(IPBooks);
		
		//BookShop IPOtherBookShop = (BookShop) IPBooks.clone();
		//IPOtherBookShop.setShopName("Another Book Shop");
		//System.out.println(IPOtherBookShop);
		//Clearly above is a shallow copy of the object
		
		BookShop IPOtherBookShop = IPBooks.clone();
		IPOtherBookShop.setShopName("Another Book Shop");
		System.out.println(IPOtherBookShop);
		
		IPBooks.getBooks().remove(2);
		System.out.println(IPBooks);
		System.out.println(IPOtherBookShop);
		

	}
}
