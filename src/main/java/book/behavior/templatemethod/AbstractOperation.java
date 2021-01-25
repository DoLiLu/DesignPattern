package book.behavior.templatemethod;

public abstract class AbstractOperation {

	private int firstNumber;
	private int secondNumber;

	public final void operate() {
		int firstNumber = getFirstNumber();
		int secondNumber = getSecondNumber();

		String operator = getOperator();

		int answer = getAnswer(firstNumber, secondNumber);

		String result = firstNumber + operator + secondNumber + " = " + answer;

		print(result);
	}

	protected abstract String getOperator();

	protected abstract int getAnswer(int firstNumber, int secondNumber);

	private void print(String result) {
		System.out.println(result);
	}

	private int getFirstNumber() {
		return firstNumber;
	}

	public final void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	private int getSecondNumber() {
		return secondNumber;
	}

	public final void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

}
