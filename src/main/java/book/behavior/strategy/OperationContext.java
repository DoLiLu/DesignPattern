package book.behavior.strategy;

public class OperationContext {

	private AbstractOperationStrategy operationStrategy;

	public OperationContext() {
		super();
	}

	public void operate(int firstNumber, int secondNumber) {
		int answer = operationStrategy.getAnswer(firstNumber, secondNumber);
		String operator = operationStrategy.getOperator();
		String result = firstNumber + operator + secondNumber + "=" + answer;
		print(result);
	}

	public void setOperationStrategy(AbstractOperationStrategy operationStrategy) {
		this.operationStrategy = operationStrategy;
	}

	public void print(String result) {
		System.out.println(result);
	}

}
