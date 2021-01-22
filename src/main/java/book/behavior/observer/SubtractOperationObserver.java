package book.behavior.observer;

public class SubtractOperationObserver extends AbstractOperationObserver {

	public SubtractOperationObserver(OperationSubject operationSubject) {
		super(operationSubject);
	}

	@Override
	public void update() {

		int firstNumber = getFirstNumber();
		int secondNumber = getSecondNumber();

		int answer = firstNumber - secondNumber;

		System.out.println(firstNumber + " - " + secondNumber + " = " + answer);
	}

}
