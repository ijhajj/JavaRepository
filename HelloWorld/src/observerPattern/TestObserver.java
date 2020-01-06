package observerPattern;

public class TestObserver {

	public static void main(String[] args) {
		Blog blog = new Blog();
		User user1 = new User(blog);
		User user2 = new User(blog);
		
		user1.printArticle();
		
		blog.postNewArticle();
		user1.printArticle();
		user2.printArticle();

	}

}
