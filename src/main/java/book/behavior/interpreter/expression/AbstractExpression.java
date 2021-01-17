package book.behavior.interpreter.expression;

import book.behavior.interpreter.CalcContext;
import book.behavior.interpreter.CalcParseException;

public abstract class AbstractExpression {
	
	public abstract void parse(CalcContext context) throws CalcParseException;

	public abstract double operate();
	
}
