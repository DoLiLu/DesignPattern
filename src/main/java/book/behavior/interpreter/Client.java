package book.behavior.interpreter;


import book.behavior.interpreter.expression.AbstractExpression;
import book.behavior.interpreter.expression.CalcExpressionFactory;

public class Client {

	public static void main(String[] args) {
		
		String text = "ADD(2,10)";
		
		CalcContext calcContext = new CalcContext(text);

		try {
			
			double result = 0;
			
			CalcToken currentToken = calcContext.getCurrentTokenAndGoToNext();

			AbstractExpression expression = CalcExpressionFactory.createExpression(currentToken);
			if (expression != null) {
				expression.parse(calcContext);

				result = expression.operate();
			}

			System.out.println("ADD(2,10) = " + result);

		} catch (CalcParseException e) {

			e.printStackTrace();
		}		
	}

}
