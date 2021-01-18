package book.behavior.iterator;

public class SubstractOperation extends AbstractOperation {

	@Override
	protected int getAnswer(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}

	@Override
	public void print(int firstNumber, int secondNumber) {

		System.out.println(firstNumber + " - " + secondNumber + " = " + getAnswer(firstNumber, secondNumber));
	}
}
