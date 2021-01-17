package book.behavior.interpreter.expression.decorator;

import book.behavior.interpreter.expression.AbstractExpression;

public class FracDecoratorExpression extends AbstractDecoratorExpression{
	
	public FracDecoratorExpression(){
		super();
	}
	
	public FracDecoratorExpression(AbstractExpression expression){
		super(expression);
	}
	
	public double operate(){				
		return 1 / expression.operate();
	}

	@Override
	protected String getFunctionName() {
		return "FRAC";
	}
	
}
