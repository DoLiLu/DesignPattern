package book.behavior.strategy;

public class SubtractOperationStrategy extends AbstractOperationStrategy {

	public int getAnswer(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}

	@Override
	public String getOperator() {
		return "-";
	}

}
