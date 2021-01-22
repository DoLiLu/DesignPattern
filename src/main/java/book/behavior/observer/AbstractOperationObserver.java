package book.behavior.observer;

public abstract class AbstractOperationObserver {

	private final OperationSubject operationSubject;

	public AbstractOperationObserver(OperationSubject operationSubject) {
		this.operationSubject = operationSubject;
	}

	public abstract void update();

	protected final int getFirstNumber() {
		return operationSubject.getFirstNumber();
	}

	protected final int getSecondNumber() {
		return operationSubject.getSecondNumber();
	}
}
