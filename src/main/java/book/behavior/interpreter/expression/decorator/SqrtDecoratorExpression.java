package book.behavior.interpreter.expression.decorator;

import book.behavior.interpreter.expression.AbstractExpression;

public class SqrtDecoratorExpression extends AbstractDecoratorExpression{
	
	public SqrtDecoratorExpression(){
		super();
	}
	
	public SqrtDecoratorExpression(AbstractExpression expression){
		super(expression);
	}
	
	public double operate(){		
		return Math.sqrt(expression.operate());
	}

	@Override
	protected String getFunctionName() {
		return "SQRT";
	}
	
}
