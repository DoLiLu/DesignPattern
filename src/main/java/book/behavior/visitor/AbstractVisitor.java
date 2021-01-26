package book.behavior.visitor;

import book.behavior.visitor.expression.AbstractExpression;

public abstract class AbstractVisitor {

	public abstract void visit(AbstractExpression expression);

}
