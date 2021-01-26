package book.behavior.visitor.expression;


import book.behavior.visitor.AbstractVisitor;

public abstract class AbstractExpression {

	public abstract int operate();

	public void accept(AbstractVisitor v) {

	}

}
