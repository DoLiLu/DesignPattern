package book.behavior.interpreter.expression;

import book.behavior.interpreter.CalcContext;
import book.behavior.interpreter.CalcParseException;
import book.behavior.interpreter.CalcToken;

import java.util.ArrayList;

public abstract class AbstractOperationExpression extends AbstractFunctionExpression {

	protected ArrayList<AbstractExpression> operandList = new ArrayList<AbstractExpression>();

	public abstract double operate();

	public final void addOperandExpression(AbstractExpression operandExpression) {
		operandList.add(operandExpression);
	}	

	@Override
	public final void parse(CalcContext context) throws CalcParseException {
		context.skipToken(getFunctionName());

		context.getCurrentTokenAndGoToNext();
		context.skipToken("(");

		CalcToken currentToken = context.getCurrentTokenAndGoToNext();

		AbstractExpression operandExpression = CalcExpressionFactory.createExpression(currentToken);
		operandExpression.parse(context);

		addOperandExpression(operandExpression);

		context.getCurrentTokenAndGoToNext();
		context.skipToken(",");

		currentToken = context.getCurrentTokenAndGoToNext();

		operandExpression = CalcExpressionFactory.createExpression(currentToken);
		operandExpression.parse(context);

		addOperandExpression(operandExpression);

		context.getCurrentTokenAndGoToNext();
		context.skipToken(")");
	}

}
