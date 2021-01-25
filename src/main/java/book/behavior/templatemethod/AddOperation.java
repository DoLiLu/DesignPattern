package book.behavior.templatemethod;

public class AddOperation extends AbstractOperation {

	protected int getAnswer(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	@Override
	protected String getOperator() {
		return "+";
	}

}
