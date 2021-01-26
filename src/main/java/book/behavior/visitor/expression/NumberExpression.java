package book.behavior.visitor.expression;


public class NumberExpression extends AbstractExpression {

	private final int value;

	public NumberExpression(int value) {
		this.value = value;
	}

	public int operate() {
		return this.value;
	}

}
