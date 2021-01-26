package book.behavior.visitor.expression;

import book.behavior.visitor.AbstractVisitor;

import java.util.ArrayList;


public abstract class AbstractOperationExpression extends AbstractExpression {

	protected ArrayList<AbstractExpression> operandList = new ArrayList<AbstractExpression>();

	public final void addOperandExpression(AbstractExpression operandExpression) {
		operandList.add(operandExpression);
	}

	@Override
	public final void accept(AbstractVisitor v) {
		AbstractExpression operandExpression = null;
		for (int i = 0; i < operandList.size(); i++) {
			operandExpression = operandList.get(i);

			operandExpression.accept(v);
		}
	}

}
