package observerPattern;
//Publisher
public interface Subject {
	void registerObserver(Subscriber observer);
	void removeObserver(Subscriber observer);
	void notifyObservers();
}
