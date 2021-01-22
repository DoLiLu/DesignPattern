package book.behavior.observer;

public interface ISubject {
	void notifyObservers();
	void registerObserver(AbstractOperationObserver observer);
}
