package observerPattern;

public class User implements Subscriber{
	private String article;
	private Subject blog;
	
	public User(Subject blog) {
		this.blog = blog;
		this.blog.registerObserver(this);
	}
	@Override
	public void updateUsers(String blogArticle) {
		this.article = blogArticle;
		System.out.println("State Change");
	}

	@Override
	public void printArticle() {
		System.out.println("Desktop browser : " + this.article);
		
	}

}
