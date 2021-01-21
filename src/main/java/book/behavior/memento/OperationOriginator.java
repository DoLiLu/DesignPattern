package book.behavior.memento;

public class OperationOriginator {

	private int firstNumber;
	private int secondNumber;

	public OperationMemento createMemento() {
		return new OperationMemento(firstNumber, secondNumber);
	}

	public void setMemento(OperationMemento memento) {
		this.firstNumber = memento.getFirstNumber();
		this.secondNumber = memento.getSecondNumber();
	}

	public void printOperations() {
		System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
		System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
		System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
		System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
}
