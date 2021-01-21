package book.behavior.memento;

public class OperationMemento {

	private final int firstNumber;
	private final int secondNumber;

	public OperationMemento(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

}
