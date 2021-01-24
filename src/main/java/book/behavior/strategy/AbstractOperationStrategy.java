package book.behavior.strategy;

public abstract class AbstractOperationStrategy {
	public abstract int getAnswer(int firstNumber, int secondNumber);
	public abstract String getOperator();
}
