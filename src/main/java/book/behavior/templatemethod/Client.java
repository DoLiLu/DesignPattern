package book.behavior.templatemethod;

public class Client {

	public static void main(String[] args) {

		int firstNumber = 100;
		int secondNumber = 20;

		AbstractOperation[] operations = { new AddOperation(),
				new SubtractOperation(), new MultiplyOperation(),
				new DivideOperation() };

		for (AbstractOperation operation : operations) {
			operation.setFirstNumber(firstNumber);
			operation.setSecondNumber(secondNumber);

			operation.operate();
		}

	}

}
