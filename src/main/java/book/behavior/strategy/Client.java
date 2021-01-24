package book.behavior.strategy;

public class Client {

	public static void main(String[] args) throws Exception {

		OperationContext operationContext = new OperationContext();
		int firstNumber = 100;
		int secondNumber = 20;

		AbstractOperationStrategy[] operationStrategies = {
				new AddOperationStrategy(), new SubtractOperationStrategy(),
				new MultiplyOperationStrategy(), new DivideOperationStrategy() };

		for (AbstractOperationStrategy operationStrategy : operationStrategies) {
			operationContext.setOperationStrategy(operationStrategy);
			operationContext.operate(firstNumber, secondNumber);
		}

	}

}
