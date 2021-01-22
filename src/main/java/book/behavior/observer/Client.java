package book.behavior.observer;

public class Client {

	public static void main(String[] args) {

		OperationSubject operationSubject = new OperationSubject();

		operationSubject.registerObserver(new AddOperationObserver(operationSubject));
		operationSubject.registerObserver(new SubtractOperationObserver(operationSubject));
		operationSubject.registerObserver(new MultiplyOperationObserver(operationSubject));
		operationSubject.registerObserver(new DivideOperationObserver(operationSubject));

		int firstNumber = 100;
		int secondNumber = 20;

		operationSubject.setNumber(firstNumber, secondNumber);

		firstNumber = 200;
		secondNumber = -30;

		operationSubject.setNumber(firstNumber, secondNumber);

	}

}
