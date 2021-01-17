package book.behavior.interpreter.expression.decorator;

import book.behavior.interpreter.CalcContext;
import book.behavior.interpreter.CalcParseException;
import book.behavior.interpreter.CalcToken;
import book.behavior.interpreter.expression.AbstractExpression;
import book.behavior.interpreter.expression.AbstractFunctionExpression;
import book.behavior.interpreter.expression.CalcExpressionFactory;

public abstract class AbstractDecoratorExpression extends AbstractFunctionExpression {
	
	protected AbstractExpression expression;
	
	protected AbstractDecoratorExpression(){
		super();
	}
	
	public AbstractDecoratorExpression(AbstractExpression expression){
		this.expression = expression;
	}

	public void setExpression(AbstractExpression expression) {
		this.expression = expression;
	}
	
	@Override
	public final void parse(CalcContext context) throws CalcParseException {
		
		context.skipToken(getFunctionName());
		
		context.getCurrentTokenAndGoToNext();
		
		context.skipToken("(");
					
		CalcToken currentToken = context.getCurrentTokenAndGoToNext();
		
		AbstractExpression expression = CalcExpressionFactory.createExpression(currentToken);
		expression.parse(context);
				
		setExpression(expression);	
				
		context.getCurrentTokenAndGoToNext();
		context.skipToken(")");
		
	}

}
