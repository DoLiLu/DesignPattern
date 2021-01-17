package book.behavior.interpreter.expression.decorator;

import book.behavior.interpreter.expression.AbstractExpression;

public class PowDecoratorExpression extends AbstractDecoratorExpression{
	
	private double exponent = 2;
	
	public PowDecoratorExpression(){
		super();
	}
	
	public PowDecoratorExpression(AbstractExpression expression, double exponent){
		super(expression);
		this.exponent = exponent;
	}
	
	public double operate(){		
		return Math.pow(expression.operate(), exponent);
	}

	@Override
	protected String getFunctionName() {
		return "POW";
	}
	
}
