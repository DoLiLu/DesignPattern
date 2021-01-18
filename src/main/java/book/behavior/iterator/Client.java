package book.behavior.iterator;

public class Client {

	public static void main(String[] args) throws Exception {

		OperationAggregate operationAggregate = new OperationAggregate();

		operationAggregate.addOperation(new AddOperation());
		operationAggregate.addOperation(new SubstractOperation());
		operationAggregate.addOperation(new MultiplyOperation());
		operationAggregate.addOperation(new DivideOperation());

		int firstNumber = 100;
		int secondNumber = 20;

		ICalcIterator calcIterator = operationAggregate.createIterator();

		while (calcIterator.hasNext()) {
			AbstractOperation operation = calcIterator.next();
			operation.print(firstNumber, secondNumber);
		}

	}

}
