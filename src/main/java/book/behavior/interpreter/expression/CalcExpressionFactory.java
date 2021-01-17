package book.behavior.interpreter.expression;

import book.behavior.interpreter.CalcToken;
import book.behavior.interpreter.expression.decorator.FracDecoratorExpression;
import book.behavior.interpreter.expression.decorator.PowDecoratorExpression;
import book.behavior.interpreter.expression.decorator.SqrtDecoratorExpression;

public class CalcExpressionFactory {

	public static final AbstractExpression createExpression(CalcToken calcToken) {
		AbstractExpression expression = null;

		if (calcToken != null) {
			if (calcToken.getType() == CalcToken.NUMBER) {
				expression = new NumberExpression(Integer.parseInt(calcToken.getToken()));
			} 			
			else if (calcToken.getType() == CalcToken.FUNCTION) {
				if (calcToken.getToken().equals("SQRT")) {
					expression = new SqrtDecoratorExpression();
				} 
				else if (calcToken.getToken().equals("FRAC")) {
					expression = new FracDecoratorExpression();
				} 
				else if (calcToken.getToken().equals("POW")) {
					expression = new PowDecoratorExpression();
				} 
				else if (calcToken.getToken().equals("ADD")) {
					expression = new AddOperationExpression();
				} 
				else if (calcToken.getToken().equals("SUB")) {
					expression = new SubstractOperationExpression();
				}
				else if (calcToken.getToken().equals("MUL")) {
					expression = new MultiplyOperationExpression();
				} 
				else if (calcToken.getToken().equals("DIV")) {
					expression = new DivideOperationExpression();
				}
			}
		}

		return expression;
	}
}
