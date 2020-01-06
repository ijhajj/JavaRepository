package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Blog implements Subject{
	List<Subscriber> observerList;
	private boolean stateChange;
	private String blogArticle;
	
	public Blog() {
		this.observerList = new ArrayList<>();
		this.stateChange = false;
	}
	@Override
	public void registerObserver(Subscriber observer) {
		observerList.add(observer);
		
	}

	@Override
	public void removeObserver(Subscriber observer) {
		observerList.remove(observer);
		
	}
	
	public void postNewArticle() {
		this.blogArticle = "Hi! Let me tell you about myself";
		stateChange = true;
		notifyObservers();
	}
	
	@Override
	public void notifyObservers() {
		if(stateChange) { //if a new article has been published
			for (Subscriber observer:observerList) {	//publish to each observer
				observer.updateUsers(blogArticle);//update each of the observer
			}
		}
		
	}

}
