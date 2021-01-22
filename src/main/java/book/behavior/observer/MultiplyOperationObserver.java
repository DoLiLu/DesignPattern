package book.behavior.observer;

public class MultiplyOperationObserver extends AbstractOperationObserver {

	public MultiplyOperationObserver(OperationSubject operationSubject) {
		super(operationSubject);
	}

	@Override
	public void update() {

		int firstNumber = getFirstNumber();
		int secondNumber = getSecondNumber();

		int answer = firstNumber * secondNumber;

		System.out.println(firstNumber + " * " + secondNumber + " = " + answer);
	}

}
