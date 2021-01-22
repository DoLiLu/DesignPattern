package book.behavior.observer;

import java.util.ArrayList;

public class OperationSubject implements ISubject {

	private int firstNumber;
	private int secondNumber;

	private final ArrayList<AbstractOperationObserver> observers = new ArrayList<AbstractOperationObserver>();

	public OperationSubject() {
		super();
	}

	public void registerObserver(AbstractOperationObserver observer) {
		observers.add(observer);
	}

	public void removeObserver(AbstractOperationObserver observer) {
		int index = observers.indexOf(observer);
		if (index >= 0) {
			observers.remove(index);
		}
	}

	public void notifyObservers() {
		AbstractOperationObserver observer;
		for (int i = 0; i < observers.size(); i++) {
			observer = observers.get(i);
			observer.update();
		}
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setNumber(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;

		notifyObservers();
	}

	public int getSecondNumber() {
		return secondNumber;
	}

}
