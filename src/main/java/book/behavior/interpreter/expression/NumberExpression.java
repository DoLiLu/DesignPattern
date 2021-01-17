package book.behavior.interpreter.expression;

import book.behavior.interpreter.CalcContext;
import book.behavior.interpreter.CalcParseException;

public class NumberExpression extends AbstractExpression {

	private int value;

	public NumberExpression(int value) {
		this.value = value;
	}

	public double operate() {
		return this.value;
	}

	@Override
	public void parse(CalcContext context) throws CalcParseException {

	}

}
